package cn.zhangjingyao.controller.base;


import cn.zhangjingyao.entity.PageData;
import com.alibaba.fastjson.JSON;
import cn.zhangjingyao.entity.Page;
import cn.zhangjingyao.entity.system.Menu;
import cn.zhangjingyao.entity.system.Role;
import cn.zhangjingyao.entity.system.User;
import cn.zhangjingyao.util.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController {
	
	protected Logger logger = Logger.getLogger(this.getClass());

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 6357869213649815390L;
	
	/**
	 * 得到PageData
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		
		return request;
	}
	
	public User getCurrentUser() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		User currentUser = (User)session.getAttribute(Const.SESSION_USER);
		return (currentUser == null ? new User() : currentUser);
	}
	
	/**
	 * 得到32位的uuid
	 * @return
	 */
	public String get32UUID(){
		
		return UuidUtil.get32UUID();
	}
	
	/**
	 * 得到分页列表的信息 
	 */
	public Page getPage(){
		
		return new Page();
	}
	
	public static void logBefore(Logger logger, String interfaceName){
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
	}
	/**
	 * 返回常规json字符串
	 * @param state 状态码
	 * @param message 返回消息
	 * @return
	 */
	public String jsonContent(String state, String message) {
		Map<String,Object> res= new HashMap<String, Object>();
		res.put("state", state);
		res.put("message", message);
		return JSON.toJSONString(res);
	}
	
	public String jsonContent(PageData pageData) {
		return JSON.toJSONString(pageData);
	}

	/**
	 * 返回分页json字符串
	 * @param dataList 结果集
	 * @param page 分页
	 * @return
	 */
	public String jsonContent(List<PageData> dataList, Page page) {
		String json = JSON.toJSONString(dataList);
		json="{\"rows\":"+json+",\"total\":"+page.getTotalPage()+",\"page\":"+page.getCurrentPage()+",\"records\":"+page.getTotalResult()+"}";
		return json;
	}
	
	public String jsonContent(List<PageData> dataList) {
		String json = JSON.toJSONString(dataList);
		return "{\"rows\":"+json+"}";
	}
	/**
	 * 设定新增时共通数据设定
	 * @param pd
	 * @return
	 */
	public PageData setInsertCommon(PageData pd) {
		pd.put("CJUSER", this.getCurrentUser().getUserId());	//创建人
		pd.put("CJSJ", DateUtil.getTime());	//创建时间
		pd.put("XGUSER", this.getCurrentUser().getUserId());	//修改人
		pd.put("XGSJ", DateUtil.getTime());	//修改时间
		return pd;
	}

	public PageData setInsertCommonName(PageData pd) {
		pd.put("CJUSER", this.getCurrentUser().getName());	//创建人
		pd.put("CJSJ", DateUtil.getTime());	//创建时间
		pd.put("XGUSER", this.getCurrentUser().getName());	//修改人
		pd.put("XGSJ", DateUtil.getTime());	//修改时间
		return pd;
	}
	/**
	 * 设定修改时共通数据设定
	 * @param pd
	 * @return
	 */
	public PageData setEditCommon(PageData pd) {
		pd.put("XGUSER", this.getCurrentUser().getUserId());	//修改人
		pd.put("XGSJ", DateUtil.getTime());	//修改时间
		return pd;
	}

	/**
	 * 按钮权限获取
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String> getHC(String menuUrl){
		Subject currentUser = SecurityUtils.getSubject();  //shiro管理的session
		Session session = currentUser.getSession();
		List<Menu> menuList = (List<Menu>)session.getAttribute(Const.SESSION_allmenuList); //获取菜单列表
		HashMap<String, String> map = (HashMap<String, String>)session.getAttribute(Const.SESSION_QX);//按钮权限
		HashMap<String, String> mapOper = (HashMap<String, String>)map.clone();

		//对二级菜单进行按钮权限判断
		for(int i=0;i<menuList.size();i++){
			for(int j=0;j<menuList.get(i).getSubMenu().size();j++){
				if(menuList.get(i).getSubMenu().get(j).getMENU_URL().split("\\.")[0].equals(menuUrl.split("\\.")[0])){
					String MENU_ID =  menuList.get(i).getSubMenu().get(j).getMENU_ID();

					List<String> operButtonList = Role.getOperButton();

					String USERNAME = session.getAttribute(Const.SESSION_USERNAME).toString();	//获取当前登录者loginname
					Boolean isAdmin = "admin".equals(USERNAME);
					if (isAdmin) {
						return map;
					} else {
						for (String s : operButtonList) {
							if (RightsHelper.testRights(map.get(s), MENU_ID)) {
								mapOper.put(s, map.get(s));
							} else {
								mapOper.put(s, "0");
							}
						}
					}
				}
			}
		}
		return mapOper;
	}
	
}

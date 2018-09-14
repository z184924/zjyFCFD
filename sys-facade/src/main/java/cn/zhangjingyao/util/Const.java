package cn.zhangjingyao.util;

import org.springframework.context.ApplicationContext;

public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode";
	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String SESSION_menuList = "menuList";			//当前菜单
	public static final String SESSION_allmenuList = "allmenuList";		//全部菜单
	public static final String SESSION_QX = "QX";
	public static final String SESSION_userpds = "userpds";
	public static final String SESSION_USERROL = "USERROL";				//用户对象
	public static final String SESSION_USERNAME = "USERNAME";			//用户名
	public static final String TRUE = "T";
	public static final String FALSE = "F";
	public static final String LOGIN = "/login_toLogin.do";				//登录地址
	public static final String YZ = "admin/config/YZ.txt";				//业主巡查频率路径
	public static final String JC = "admin/config/JC.txt";				//第三方检测单位巡查频率路径
	public static final String JL = "admin/config/JL.txt";				//监理单位巡查频率路径
	public static final String SG = "admin/config/SG.txt";				//施工单位巡查频率路径
	public static final String SYSNAME = "admin/config/SYSNAME.txt";	//系统名称路径
	public static final String PAGE	= "admin/config/PAGE.txt";			//分页条数配置路径
	public static final String EMAIL = "admin/config/EMAIL.txt";		//邮箱服务器配置路径
	public static final String SMS1 = "admin/config/SMS1.txt";			//短信账户配置路径1
	public static final String SMS2 = "admin/config/SMS2.txt";			//短信账户配置路径2
	public static final String FWATERM = "admin/config/FWATERM.txt";	//文字水印配置路径
	public static final String IWATERM = "admin/config/IWATERM.txt";	//图片水印配置路径
	public static final String WEIXIN	= "admin/config/WEIXIN.txt";	//微信配置路径
	public static final String WEBSOCKET = "admin/config/WEBSOCKET.txt";//WEBSOCKET配置路径
	public static final String IMAGE_UPLOAD_PATH = "uploadFiles/images/";	//图片上传路径
	public static final String FILE_UPLOAD_PATH = "uploadFiles/files/";		//文件上传路径
	public static final String TMP_UPLOAD_PATH = "uploadFiles/tmp/";		//文件上传临时路径
	public static final String TEMPLATE_FILE_PATH = "static/files/";		//模板文件路径
	public static final String DWG_FILE_PATH = "dwg/";		//CAD文件路径
	public static final String FILEPATHTWODIMENSIONCODE = "uploadFiles/twoDimensionCode/"; //二维码存放路径
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(plugins)|(logout)|(code)|(weixin)|(app)|(static)|(websocket)|(favicon)|(login_default)).*";	//不对匹配该值的访问路径拦截（正则）
	public static final String TOKEN_INTERCEPTOR_PATH = ".*/((api)|(pdapi)).*";	//对匹配该值的访问路径采用Token验证（正则）
	public static final String SYSTEM_ID="BIM";	//系统标识
	
	public static ApplicationContext WEB_APP_CONTEXT = null; //该值会在web容器启动时由WebAppContextListener初始化
	
	/**
	 * APP Constants
	 */
	//app注册接口_请求协议参数)
	public static final String[] APP_REGISTERED_PARAM_ARRAY = new String[]{"countries","uname","passwd","title","full_name","company_name","countries_code","area_code","telephone","mobile"};
	public static final String[] APP_REGISTERED_VALUE_ARRAY = new String[]{"国籍","邮箱帐号","密码","称谓","名称","公司名称","国家编号","区号","电话","手机号"};
	
	//app根据用户名获取会员信息接口_请求协议中的参数
	public static final String[] APP_GETAPPUSER_PARAM_ARRAY = new String[]{"USERNAME"};
	public static final String[] APP_GETAPPUSER_VALUE_ARRAY = new String[]{"用户名"};

	public static final String FILE_UPLOAD_JCPATH = "uploadFiles/files/jcwd/";		//监测文档上传路径
	public static final String FILE_UPLOAD_XCXSPATH = "uploadFiles/files/xcxs/";    //现场巡视文档上传路径
	public static final String FILE_UPLOAD_YJKBPATH = "uploadFiles/files/yjkb/";    //预警快报文档上传路径
	public static final String FILE_UPLOAD_DBWDPATH="uploadFiles/files/dbwd/";       //对比文档上传路径
	public static final String FILE_UPLOAD_XIUJIAPATH="uploadFiles/files/xiujia/";       //休假文档上传路径
	
	
	public static final String FILE_UPLOAD_AQSCDBGLPATH="uploadFiles/files/aqscdbgl/";  //安全生产带班管理文档上传路径
	public static final String FILE_UPLOAD_FXGWXCGLPATH="uploadFiles/files/fxgwxcgl/";  //风险顾问巡查管理文档上传路径
	public static final String FILE_UPLOAD_YJGLPATH="uploadFiles/files/yjgl/";  //应急管理文档上传路径
	public static final String FILE_UPLOAD_YZQXDGLPATH="uploadFiles/files/yzqxdgl/";  //业主抢险队管理文档上传路径
	public static final String FILE_UPLOAD_AQWMCYGLPATH="uploadFiles/files/aqwmcygl/";  //安全文明创优管理文档上传路径
	public static final String FILE_UPLOAD_AQSGGLPATH="uploadFiles/files/aqsggl/";  //安全事故管理文档上传路径
	public static final String FILE_UPLOAD_AQSCBZJPATH="uploadFiles/files/aqscbzj/";  //安全生产保证金文档上传路径
	
	public static final String SP_STATUS_ID = "e2a3eb5dde01489aac410f106204c055";
	

	

	
}

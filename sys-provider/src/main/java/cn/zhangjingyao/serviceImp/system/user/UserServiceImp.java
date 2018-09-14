package cn.zhangjingyao.serviceImp.system.user;

import com.alibaba.dubbo.config.annotation.Service;
import cn.zhangjingyao.dao.DaoSupport;
import cn.zhangjingyao.entity.system.User;
import cn.zhangjingyao.service.system.user.UserService;
import cn.zhangjingyao.util.PageData;

import javax.annotation.Resource;

@Service(interfaceClass = UserService.class)
public class UserServiceImp implements UserService {
	
	@Resource(name = "daoSupport")
	private DaoSupport dao;

	/*
	 * 通过用户名密码获取数据
	 */
	@Override
	public User loginUser(PageData pd)throws Exception{
		return (User)dao.findForObject("UserMapper.loginUser", pd);
	}

}


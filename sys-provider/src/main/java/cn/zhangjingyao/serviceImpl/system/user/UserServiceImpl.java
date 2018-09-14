package cn.zhangjingyao.serviceImpl.system.user;

import com.alibaba.dubbo.config.annotation.Service;
import cn.zhangjingyao.dao.DaoImpl;
import cn.zhangjingyao.entity.system.User;
import cn.zhangjingyao.service.system.user.UserService;
import cn.zhangjingyao.util.PageData;

import javax.annotation.Resource;

@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
	
	@Resource
	private DaoImpl dao;

	/*
	 * 通过用户名密码获取数据
	 */
	public User loginUser(PageData pd)throws Exception{
		return (User)dao.findForObject("UserMapper.loginUser", pd);
	}

}


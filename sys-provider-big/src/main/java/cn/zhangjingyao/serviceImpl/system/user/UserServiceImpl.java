package cn.zhangjingyao.serviceImpl.system.user;

import cn.zhangjingyao.dao.DaoImpl;
import cn.zhangjingyao.entity.PageData;
import cn.zhangjingyao.entity.system.User;
import cn.zhangjingyao.service.system.user.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

	@Autowired
	private DaoImpl dao;

	/*
	 * 通过用户名密码获取数据
	 */
	@Override
	public User loginUser(PageData pd)throws Exception{
		return (User)dao.findForObject("UserMapper.loginUser", pd);
	}

}


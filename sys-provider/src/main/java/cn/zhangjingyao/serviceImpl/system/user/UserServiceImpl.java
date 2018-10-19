package cn.zhangjingyao.serviceImpl.system.user;

import com.alibaba.dubbo.config.annotation.Service;
import cn.zhangjingyao.dao.DaoImpl;
import cn.zhangjingyao.entity.system.User;
import cn.zhangjingyao.service.system.user.UserService;
import cn.zhangjingyao.entity.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service(interfaceClass = UserService.class)
@com.alibaba.dubbo.config.annotation.Service
@org.springframework.stereotype.Service
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

	@Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void save(PageData pd) throws Exception {
		dao.save("UserMapper.save",pd);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void save(List<PageData> list) throws Exception {
		for (PageData pd:list) {
			dao.save("UserMapper.save",pd);
		}
	}


}


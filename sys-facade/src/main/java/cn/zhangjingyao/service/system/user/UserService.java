package cn.zhangjingyao.service.system.user;

import cn.zhangjingyao.entity.system.User;
import cn.zhangjingyao.util.PageData;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	/*
	 * 通过用户名密码获取数据
	 */
	public User loginUser(PageData pd)throws Exception;


}


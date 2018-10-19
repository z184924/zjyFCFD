package cn.zhangjingyao.service.system.user;

import cn.zhangjingyao.entity.system.User;
import cn.zhangjingyao.entity.PageData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

	/**
	 * 通过用户名密码获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public User loginUser(PageData pd)throws Exception;

	public void save(PageData pd)throws Exception;

	public void save(List<PageData> list)throws Exception;


}


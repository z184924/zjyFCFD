package cn.zhangjingyao.entity.system;

import java.io.Serializable;

/**
 * 
* 类名称：User.java
* 类描述： 
* @version 1.0
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;		//用户id
	private String userName;	//用户名
	private String password; 	//密码
	private String name;		//姓名
	private String companyId;	//公司ID
	private Integer isAdmin; 	//是否管理员
	private Integer sortNum; 	//排序号
	private String lastLogin;	//最后登录时间
	private Integer state;		//启用状态


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}

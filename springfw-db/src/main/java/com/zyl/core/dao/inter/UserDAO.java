package com.zyl.core.dao.inter;

import java.util.List;

public interface UserDAO<User>{
	public User queryByUserName(String userName);
	public List<User> queryAll();
}

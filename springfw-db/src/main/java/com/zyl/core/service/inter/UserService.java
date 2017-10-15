package com.zyl.core.service.inter;

import com.zyl.core.pojo.User;

public interface UserService {
	public void addUser(User user);
	
	public void deleteUser(String userName);
}

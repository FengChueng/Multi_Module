package com.zyl.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zyl.core.pojo.User;
import com.zyl.core.repository.UserRepository;
import com.zyl.core.service.inter.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userDAO;
	
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	public void addUser(User user) {
		userDAO.save(user);
		
	}

	@Override
	public void deleteUser(String userName) {
		// TODO Auto-generated method stub
		
	}

}

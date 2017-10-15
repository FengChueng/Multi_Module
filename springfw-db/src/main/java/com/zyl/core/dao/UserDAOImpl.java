package com.zyl.core.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zyl.core.dao.inter.UserDAO;
import com.zyl.core.pojo.User;

public class UserDAOImpl extends BaseDao<User> implements UserDAO<User> {

	@Override
	public User queryByUserName(String userName) {
		return (User)createCriteria(User.class).add(Restrictions.eq("userName", userName)).getExecutableCriteria(openSession()).uniqueResult();
	}

	@Override
	public List<User> queryAll() {
		return createCriteria(User.class).getExecutableCriteria(openSession()).list();
	}

}

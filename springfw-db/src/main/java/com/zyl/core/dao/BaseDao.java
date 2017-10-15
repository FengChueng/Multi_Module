package com.zyl.core.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;

public abstract class BaseDao<T>{
	@Resource
	SessionFactory sessionFactory;
	
	public Session openSession() {
//		sessionFactory.openSession();
		return sessionFactory.getCurrentSession();
	}
	
	public DetachedCriteria createCriteria(Class<T> clz) {
		return DetachedCriteria.forClass(clz);
	}
	
	
	public void insert(T t){
		openSession().save(t);
	}
	public void update(T t){
		openSession().update(t);
	}
	public void delete(T t){
		openSession().delete(t);
	}
	public T queryById(int id,Class<T> clz){
		return openSession().load(clz, id);
	}	
	
}

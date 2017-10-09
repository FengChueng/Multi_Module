package com.zyl.core.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="user")
@DynamicInsert
@DynamicUpdate
public class User {
	@Id
	@GeneratedValue
	private int id;
//	private String u_id;//生成规则
	@Column(name="user_name",length=20)
	private String userName;
	@Column(name="user_sex")
	private int userSex;//0:female,1:male
	@Column(name="user_age")	
	private int userAge;
	@OneToMany(targetEntity=Order.class,cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Set<Order> orderList = new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public Set<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(Set<Order> orderList) {
		this.orderList = orderList;
	}
	
	
}

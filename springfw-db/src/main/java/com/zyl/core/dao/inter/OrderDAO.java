package com.zyl.core.dao.inter;

import java.util.List;

public interface OrderDAO<Order>{
	public Order queryByOrderNum(String orderNum);
	public List<Order> queryUserOrders(int userId);	
	public List<Order> queryAll();
}

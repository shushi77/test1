package com.seven.sp01.service;

import com.seven.sp01.pojo.Order;

public interface OrderService {

	Order getOrder(String orderId);
	void addOrder(Order order);

}

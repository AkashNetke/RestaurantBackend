package com.service;

import java.util.List;

import com.model.Orders;


public interface OrderServiceInterface {
	
	public Orders saveOrder(Orders order);
	public List<Orders> getAllOrder();

}

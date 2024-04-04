package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Orders;
import com.repository.OrderRepository;

@Service
public class OrderServiceImplementation implements OrderServiceInterface{

	@Autowired
	OrderRepository orderRepo;
	
	
	@Override
	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public List<Orders> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

}

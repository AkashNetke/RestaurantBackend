package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Orders;
import com.service.OrderServiceInterface;

@RestController
public class OrderController {
	
	
	@Autowired
	OrderServiceInterface orderServ;
	
	@PostMapping("/saveOrder")
	public Orders saveOrder(@RequestBody Orders order) {
		return orderServ.saveOrder(order);
	}
	
	@GetMapping("getAllOrders")
	public List<Orders> getAllOrder() {
		return orderServ.getAllOrder();
	}

}

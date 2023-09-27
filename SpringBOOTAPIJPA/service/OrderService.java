package com.springbootrestapiJPA.SpringBOOTAPIJPA.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootrestapiJPA.SpringBOOTAPIJPA.model.Order;

public interface OrderService {
	
	public List<Order>getAllOrders();
	public Order getOrderById(@PathVariable Long orderId);
	public Order createOrder(@RequestBody Order order);

}

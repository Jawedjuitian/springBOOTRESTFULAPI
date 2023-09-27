package com.springbootrestapiJPA.SpringBOOTAPIJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootrestapiJPA.SpringBOOTAPIJPA.dao.OrderrepoDao;
import com.springbootrestapiJPA.SpringBOOTAPIJPA.model.Order;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderrepoDao orderepodao;
	
	
	public OrderServiceImpl() {
		
	}
	@Override
	public List<Order>getAllOrders(){
		return orderepodao.findAll();
	}
	
	@Override
	public Order createOrder(Order order) {
		orderepodao.save(order);
		return order;
	}

	@Override
	public Order getOrderById(@PathVariable Long orderId) {
		return orderepodao.getOne(orderId);
}
}
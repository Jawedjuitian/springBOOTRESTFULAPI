package com.springbootrestapiJPA.SpringBOOTAPIJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapiJPA.SpringBOOTAPIJPA.dao.OrderrepoDao;
import com.springbootrestapiJPA.SpringBOOTAPIJPA.model.Order;
import com.springbootrestapiJPA.SpringBOOTAPIJPA.service.OrderService;



@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	
	
	@PostMapping("/Orders")
	public Order createOrder(@RequestBody Order order) {
		
		return this.orderservice.createOrder(order);
	    // Implement the logic to create a new order and save it to the database
	    // Return the created order and an HTTP status code
		
		
		
	}

	@GetMapping("/{orderId}")
	public Order getOrderById(@PathVariable Long orderId) {
		return this.orderservice.getOrderById(orderId);
	    // Implement the logic to retrieve an order by its ID
	    // Return the order and an HTTP status code
		
		
		
		
	}

	@GetMapping
	public List<Order> getAllOrders() {
		return this.orderservice.getAllOrders();
	    // Implement the logic to retrieve all orders
	    // Return a list of orders and an HTTP status code
		
		
		
		
	}


}

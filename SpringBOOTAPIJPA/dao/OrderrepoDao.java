package com.springbootrestapiJPA.SpringBOOTAPIJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrestapiJPA.SpringBOOTAPIJPA.model.Order;

public interface OrderrepoDao extends JpaRepository<Order, Long> {

}
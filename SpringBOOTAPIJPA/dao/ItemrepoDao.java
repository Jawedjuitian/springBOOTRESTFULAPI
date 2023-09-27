package com.springbootrestapiJPA.SpringBOOTAPIJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrestapiJPA.SpringBOOTAPIJPA.model.Item;

public interface ItemrepoDao extends JpaRepository<Item,Long>  {

}

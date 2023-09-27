package com.springbootrestapiJPA.SpringBOOTAPIJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String itemName;
  
	private double itemUnitPrice;
    private int itemQuantity;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
    
public Item() {
	
}
    // Constructors, getters, and setters
    public Item(Long itemId, String itemName, double itemUnitPrice, int itemQuantity, Order order) {
  		super();
  		this.itemId = itemId;
  		this.itemName = itemName;
  		this.itemUnitPrice = itemUnitPrice;
  		this.itemQuantity = itemQuantity;
  		this.order = order;
  	
    
    
    }
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemUnitPrice() {
		return itemUnitPrice;
	}
	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}


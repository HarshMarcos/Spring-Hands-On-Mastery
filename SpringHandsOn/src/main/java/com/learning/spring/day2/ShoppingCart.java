package com.learning.spring.day2;

import java.util.ArrayList;

import java.util.List;

import com.learning.spring.day1.Product;

public class ShoppingCart {
	
	private List<Product> items = new ArrayList<Product>();
	
	public void addItem(Product item) {
		items.add(item);
	}
	
	public List<Product> getItems(){
		return items;
	}
	
	public void removeItem(Product product) {
		items.remove(product);
	}
	
	public void updateItem(Object item) {
	   
	}
}

package com.learning.spring.day1;

public class Disc extends Product{
	
	private int capacity;
	
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	
	public Disc(String productId, String productName, double price, int capacity) {
		super(productId, productName, price);
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Disc [capacity=" + capacity + "]";
	}
	
	

}
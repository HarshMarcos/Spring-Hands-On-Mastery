package com.learning.spring.day2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.day1.Product;

public class D05P04 {

	public static void main(String[] args) {
		 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("shoppingBeans.xml");
	        
	       
	        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
	        cart1.addItem(new Product("101","Product 1",5000.00));
	        cart1.addItem(new Product("102","Product 2",6000.00));
	        
	        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
	        cart2.addItem(new Product("103","Product 3",50400.00));
	        
	      
	        System.out.println("Cart 1 items: " + cart1.getItems());
	        System.out.println("Cart 2 items: " + cart2.getItems());
	        
	       
	        context.close();
	}

}

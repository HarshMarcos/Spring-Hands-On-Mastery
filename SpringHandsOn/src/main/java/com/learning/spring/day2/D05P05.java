package com.learning.spring.day2;

import java.io.IOException;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class D05P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cashierbeans.xml");
		 
	      
	        Cashier cashier = (Cashier) context.getBean("cashierBean");
	 
	       
	        ShoppingCart cart = new ShoppingCart(); 
	       
	 
	        try {
	            cashier.checkout(cart);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	        
	        context.close();
	}

}

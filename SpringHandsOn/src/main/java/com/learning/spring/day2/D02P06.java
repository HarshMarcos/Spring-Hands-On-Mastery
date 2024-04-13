package com.learning.spring.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.day1.Product;

public class D02P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springaop.xml");
		 
        
        ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");
        
        Product product;
        
        shoppingCart.getItems();
        shoppingCart.addItem(product);;
        shoppingCart.removeItem(product);;
        shoppingCart.updateItem(new Object());
	}

}

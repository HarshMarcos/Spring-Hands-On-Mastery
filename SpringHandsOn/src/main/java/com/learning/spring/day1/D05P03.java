package com.learning.spring.day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class D05P03 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Battery bat= (Battery)context.getBean("battery");
		System.out.println(bat);
		
		Disc disc= (Disc)context.getBean("disc");
		System.out.println(disc);

	}

}

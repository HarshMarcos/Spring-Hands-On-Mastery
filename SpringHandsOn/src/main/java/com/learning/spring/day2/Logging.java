package com.learning.spring.day2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
	
	@Pointcut("execution(* com.learning.spring.day2.ShoppingCart.getItems())")
	public void getItemsPointcut() {};
	
	 @Pointcut("execution(* com.learning.spring.day2.ShoppingCart.addItem(..))")
	    public void addItemPointcut() {}
	 
	    @Pointcut("execution(* com.learning.spring.day2.ShoppingCart.removeItem(..))")
	    public void removeItemPointcut() {}
	 
	    @Pointcut("execution(* com.learning.spring.day2.ShoppingCart.updateItem(..))")
	    public void updateItemPointcut() {}
	 
	    @Before("getItemsPointcut() || addItemPointcut() || removeItemPointcut() || updateItemPointcut()")
	    public void logBefore() {
	        System.out.println("Logging before method execution...");
	    }
	 
	    @AfterReturning(pointcut = "getItemsPointcut() || addItemPointcut() || removeItemPointcut() || updateItemPointcut()",
	                    returning = "result")
	    public void logAfterReturning(Object result) {
	        System.out.println("Logging after method returning...");
	    }
	 
	    @AfterThrowing(pointcut = "getItemsPointcut() || addItemPointcut() || removeItemPointcut() || updateItemPointcut()",
	                    throwing = "exception")
	    public void logAfterThrowing(Exception exception) {
	        System.out.println("Logging after method throwing exception: " + exception.getMessage());
	    }

}

package com.learning.spring.day3;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@ComponentScan(basePackages = "com.learning.spring.day3")
public class D03P09 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(ConfigDB.class);
         PassengerService passengerService = context.getBean(PassengerService.class);
  
         // Test CRUD operations
         Passenger newPassenger = new Passenger(1239, "Test", new Date(), "1234567890", "test@example.com");
         passengerService.addPassenger(newPassenger);
  
         Passenger retrievedPassenger = passengerService.getPassengerById(1239);
         System.out.println("Retrieved Passenger: " + retrievedPassenger);
  
         retrievedPassenger.setPassengerEmail("updated@example.com");
         passengerService.updatePassenger(retrievedPassenger);
         Passenger updatedPassenger = passengerService.getPassengerById(1239);
         System.out.println("Updated Passenger: " + updatedPassenger);
  
         passengerService.deletePassenger(1239);
         System.out.println("Passenger deleted.");
  
         // Retrieve deleted passenger to verify deletion
         Passenger deletedPassenger = passengerService.getPassengerById(1239);
         System.out.println("Deleted Passenger: " + deletedPassenger);
    }
}

package com.learning.spring.day3;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = "com.learning.spring.day3")
public class D03P10 
{
	  public static void main( String[] args )
	    {
		  try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class)) {
	            PassengerService passengerService = context.getBean(PassengerService.class);
	            Scanner scanner = new Scanner(System.in);
	            
	            while (true) {
	                System.out.println("Menu:");
	                System.out.println("1. Insert Passenger");
	                System.out.println("2. Update Passenger");
	                System.out.println("3. Delete Passenger");
	                System.out.println("4. Get Passenger by ID");
	                System.out.println("5. Get All Passengers");
	                System.out.println("6. Exit");
	                System.out.print("Enter your choice: ");
	                
	                int choice = scanner.nextInt();
	                scanner.nextLine();  // Consume newline
	                
	                switch (choice) {
	                    case 1:
	                        // Insert Passenger
	                        Passenger newPassenger = new Passenger();
	                        System.out.print("Enter Passenger Name: ");
	                        newPassenger.setPassengerName(scanner.nextLine());
	                        System.out.print("Enter Passenger DOB (YYYY-MM-DD): ");
	                        // Parse DOB from string input
	                        // Set other attributes similarly
	                        passengerService.savePassenger(newPassenger);
	                        System.out.println("Passenger inserted successfully!");
	                        break;
	                    case 2:
	                        // Update Passenger
	                        System.out.print("Enter Passenger ID to update: ");
	                        int updateId = scanner.nextInt();
	                        scanner.nextLine();  // Consume newline
	                        Passenger passengerToUpdate = passengerService.getPassengerById(updateId);
	                        if (passengerToUpdate != null) {
	                            System.out.print("Enter new Passenger Name: ");
	                            passengerToUpdate.setPassengerName(scanner.nextLine());
	                            // Update other attributes similarly
	                            passengerService.updatePassenger(passengerToUpdate);
	                            System.out.println("Passenger updated successfully!");
	                        } else {
	                            System.out.println("Passenger not found!");
	                        }
	                        break;
	                    case 3:
	                        // Delete Passenger
	                        System.out.print("Enter Passenger ID to delete: ");
	                        int deleteId = scanner.nextInt();
	                        scanner.nextLine();  // Consume newline
	                        passengerService.deletePassenger(deleteId);
	                        System.out.println("Passenger deleted successfully!");
	                        break;
	                    case 4:
	                        // Get Passenger by ID
	                        System.out.print("Enter Passenger ID to retrieve: ");
	                        int retrieveId = scanner.nextInt();
	                        scanner.nextLine();  // Consume newline
	                        Passenger retrievedPassenger = passengerService.getPassengerById(retrieveId);
	                        if (retrievedPassenger != null) {
	                            System.out.println("Passenger details:");
	                            System.out.println(retrievedPassenger);
	                        } else {
	                            System.out.println("Passenger not found!");
	                        }
	                        break;
	                    case 5:
	                        // Get All Passengers
	                        List<Passenger> allPassengers = passengerService.getAllPassengers();
	                        System.out.println("All Passengers:");
	                        for (Passenger passenger : allPassengers) {
	                            System.out.println(passenger);
	                        }
	                        break;
	                    case 6:
	                        System.out.println("Exiting...");
	                        return;
	                    default:
	                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
	                }
	            }
	        }
	    }
	}


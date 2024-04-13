package com.learning.spring.day3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Scope("prototype")
@Service
public class PassengerService {
	
		@Autowired
	    private PassengerDAO passengerDAO;
	    
	    public List<Passenger> getAllPassengers() {
	        return passengerDAO.getAllPassengers();
	    }
	    
	    public Passenger getPassengerById(int id) {
	        return passengerDAO.getPassengerById(id);
	    }
	    
	    public void addPassenger(Passenger passenger) {
	        passengerDAO.addPassenger(passenger);
	    }
	    
	    public void updatePassenger(Passenger passenger) {
	        passengerDAO.updatePassenger(passenger);
	    }
	    
	    public void deletePassenger(int id) {
	        passengerDAO.deletePassenger(id);
	    }
}

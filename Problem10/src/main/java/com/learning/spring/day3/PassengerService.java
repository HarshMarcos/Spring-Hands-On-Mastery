package com.learning.spring.day3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
    @Autowired
    private PassengerDAO passengerDAO;
    
    public void savePassenger(Passenger passenger) {
        passengerDAO.savePassenger(passenger);
    }
    
    public void updatePassenger(Passenger passenger) {
        passengerDAO.updatePassenger(passenger);
    }
    
    public void deletePassenger(int id) {
        passengerDAO.deletePassenger(id);
    }
    
    public Passenger getPassengerById(int id) {
        return passengerDAO.getPassengerById(id);
    }
    
    public List<Passenger> getAllPassengers() {
        return passengerDAO.getAllPassengers();
    }
}

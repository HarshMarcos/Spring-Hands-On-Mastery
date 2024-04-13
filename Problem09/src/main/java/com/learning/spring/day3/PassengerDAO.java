package com.learning.spring.day3;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PassengerDAO {
	List<Passenger> getAllPassengers();
    Passenger getPassengerById(int id);
    void addPassenger(Passenger passenger);
    void updatePassenger(Passenger passenger);
    void deletePassenger(int id);
}
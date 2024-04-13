package com.learning.spring.day3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

//@Repository
@Component
public class PassengerDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Transactional
    public void savePassenger(Passenger passenger) {
        hibernateTemplate.save(passenger);
    }
    
    @Transactional
    public void updatePassenger(Passenger passenger) {
        hibernateTemplate.update(passenger);
    }
    
    @Transactional
    public void deletePassenger(int id) {
        Passenger passenger = hibernateTemplate.get(Passenger.class, id);
        if (passenger != null) {
            hibernateTemplate.delete(passenger);
        }
    }
    
    public Passenger getPassengerById(int id) {
        return hibernateTemplate.get(Passenger.class, id);
    }
    
    public List<Passenger> getAllPassengers() {
        return hibernateTemplate.loadAll(Passenger.class);
    }
}
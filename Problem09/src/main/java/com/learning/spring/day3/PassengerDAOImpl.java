package com.learning.spring.day3;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Component
public class PassengerDAOImpl implements PassengerDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public PassengerDAOImpl(DataSource dataSource) {
	        jdbcTemplate = new JdbcTemplate(dataSource);
	}

	 public List<Passenger> getAllPassengers() {
	        String sql = "SELECT * FROM Passenger_Details";
	        return jdbcTemplate.query(sql, new PassengerRowMapper());
	    }
	    
	    public Passenger getPassengerById(int id) {
	        String sql = "SELECT * FROM Passenger_Details WHERE Passenger_id = ?";
	        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new PassengerRowMapper());
	    }
	    
	    public void addPassenger(Passenger passenger) {
	        String sql = "INSERT INTO Passenger_Details (Passenger_id, Passenger_name, Passenger_dob, Passenger_phone, Passenger_email) VALUES (?, ?, ?, ?, ?)";
	        jdbcTemplate.update(sql, passenger.getPassengerId(), passenger.getPassengerName(), passenger.getPassengerDOB(), passenger.getPassengerPhone(), passenger.getPassengerEmail());
	    }
	    
	    public void updatePassenger(Passenger passenger) {
	        String sql = "UPDATE Passenger_Details SET Passenger_name = ?, Passenger_dob = ?, Passenger_phone = ?, Passenger_email = ? WHERE Passenger_id = ?";
	        jdbcTemplate.update(sql, passenger.getPassengerName(), passenger.getPassengerDOB(), passenger.getPassengerPhone(), passenger.getPassengerEmail(), passenger.getPassengerId());
	    }
	    
	    public void deletePassenger(int id) {
	        String sql = "DELETE FROM Passenger_Details WHERE Passenger_id = ?";
	        jdbcTemplate.update(sql, id);
	    }

}

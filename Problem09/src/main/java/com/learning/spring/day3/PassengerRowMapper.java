package com.learning.spring.day3;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengerRowMapper implements RowMapper<Passenger>{

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setPassengerId(rs.getInt("Passenger_id"));
		passenger.setPassengerName(rs.getString("Passenger_name"));
        passenger.setPassengerDOB(rs.getDate("Passenger_dob"));
        passenger.setPassengerPhone(rs.getString("Passenger_phone"));
        passenger.setPassengerEmail(rs.getString("Passenger_email"));
		return passenger;
	}

}

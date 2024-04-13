package com.learning.spring.day3;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passenger_Details")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Passenger_id")
    private int passengerId;
    
    @Column(name = "Passenger_name")
    private String passengerName;
    
    @Column(name = "Passenger_dob")
    private Date passengerDOB;
    
    @Column(name = "Passenger_phone")
    private String passengerPhone;
    
    @Column(name = "Passenger_email")
    private String passengerEmail;

    public Passenger() {
		// TODO Auto-generated constructor stub
	}

	public Passenger(int passengerId, String passengerName, Date passengerDOB, String passengerPhone,
			String passengerEmail) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerDOB = passengerDOB;
		this.passengerPhone = passengerPhone;
		this.passengerEmail = passengerEmail;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getPassengerDOB() {
		return passengerDOB;
	}

	public void setPassengerDOB(Date passengerDOB) {
		this.passengerDOB = passengerDOB;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerDOB="
				+ passengerDOB + ", passengerPhone=" + passengerPhone + ", passengerEmail=" + passengerEmail + "]";
	}
    
	
   
}

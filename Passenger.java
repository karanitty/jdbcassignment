package com.ibsplc.jdbc.assignment1;

public class Passenger {
	
	private int passengerId;
	private String passengerName;
	private String city;
	
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	

	public Passenger(int passengerId, String passengerName, String city) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", city=" + city + "]";
	}


	
	

}

package com.ibsplc.jdbc.assignment1;

public class Booking {
	
	private int flightId;
	private int bookingId;
	private double amount;
	private int passengerId;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}	

	public Booking(int flightId, int bookingId, double amount, int passengerId) {
		super();
		this.flightId = flightId;
		this.bookingId = bookingId;
		this.amount = amount;
		this.passengerId = passengerId;
	}



	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	@Override
	public String toString() {
		return "Booking [flightId=" + flightId + ", bookingId=" + bookingId + ", amount=" + amount + ", passengerId="
				+ passengerId + "]";
	}
	
	
	

}

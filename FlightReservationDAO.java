package com.ibsplc.jdbc.assignment1;

import java.util.List;

public interface FlightReservationDAO {
	
	public boolean bookTicket(int bookingId,int passengerId,String origin, String destination, String departureDate, double amount);
	public boolean registerPassenger(int passengerId, String passengerName, String city);
	public List<Flight> getFlight(String origin, String destination, String departureDate);
	
	int getEconomySeat(String origin, String destination, String departureDate);
	
	public List<Passenger> getPassengerList(int flightid);
	
//	public String getFlight(String origin, String destination);
	
	public List<City>  getCityList();
	

}

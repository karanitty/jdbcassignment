package com.ibsplc.jdbc.assignment1;

public class Flight {
	
	private int flightId;
	private String flightName;
	private String origin;
	private String destination;
	private String departureDate;
	private int economyClassAvailable;
	private int businessClassAvailable;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public Flight(int flightId, String flightName, String origin, String destination, String departureDate,
			int economyClassAvailable, int businessClassAvailable) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.economyClassAvailable = economyClassAvailable;
		this.businessClassAvailable = businessClassAvailable;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public int isEconomyClassAvailable() {
		return economyClassAvailable;
	}

	public void setEconomyClassAvailable(int economyClassAvailable) {
		this.economyClassAvailable = economyClassAvailable;
	}

	public int isBusinessClassAvailable() {
		return businessClassAvailable;
	}

	public void setBusinessClassAvailable(int businessClassAvailable) {
		this.businessClassAvailable = businessClassAvailable;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", origin=" + origin + ", destination="
				+ destination + ", departureDate=" + departureDate + ", economyClassAvailable=" + economyClassAvailable
				+ ", businessClassAvailable=" + businessClassAvailable + "]";
	}

	
}

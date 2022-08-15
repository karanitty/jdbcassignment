package com.ibsplc.jdbc.assignment1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FlightReservationDAOImpl implements FlightReservationDAO{

	@Override
	public boolean bookTicket(int bookingId,int passengerId, String origin, String destination, String departureDate,
			double amount) {
		boolean bookStatus = false;
		
		try {
			Connection con = ConnectionUtil.getConnection();

			if(con!=null) {
				System.out.println("Connection");
				PreparedStatement pst = con.prepareStatement("SELECT FLIGHTID FROM FLIGHT WHERE ORIGIN = ? AND DESTINATION = ? AND DEPARTUREDATE = ?");
				Date date = Date.valueOf(departureDate);
				pst.setString(1, origin);
				pst.setString(2, destination);
				pst.setDate(3, date);
				System.out.println("executed");
				ResultSet rs = pst.executeQuery();
				System.out.println("executed");
				if(rs.next()) {
					int id = rs.getInt(1);
					System.out.println(id);
					pst = con.prepareStatement("INSERT INTO BOOKING VALUES(?,?,?,?)");
					pst.setInt(1, id);
					pst.setInt(2, bookingId);
					pst.setDouble(3, amount);
					pst.setInt(4, passengerId);
					int result = pst.executeUpdate();
					if(result == 1) {
						System.out.println("Booking successful");
						bookStatus = true;
					}
					else {
						System.out.println("Failed");
					}
				}
				con.close();
					
				
			}
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
		// TODO Auto-generated method stub
		return bookStatus;
	}

	@Override
	public boolean registerPassenger(int passengerId, String passengerName, String city) {
		// TODO Auto-generated method stub
		boolean registerStatus = false;
		
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pt = con.prepareStatement("INSERT INTO PASSENGER VALUES(?,?,?)");
			pt.setInt(1, passengerId);
			pt.setString(2, passengerName);
			pt.setString(3, city);
			int result = pt.executeUpdate();
			if(result == 1) {
				System.out.println("Passenger added");
				registerStatus = true;
			}
			con.close();
		}
		catch(SQLException e){
			e.getStackTrace();
		}
		return registerStatus;
	}

	@Override
	public List<Flight> getFlight(String origin, String destination, String departureDate) {
		// TODO Auto-generated method stub
		List<Flight> flightList = new ArrayList<Flight>();
		Flight newFlight = null;
		
		try {
			Connection con = ConnectionUtil.getConnection();
			
			PreparedStatement ps = con.prepareStatement("SELECT FLIGHTID, FLIGHTNAME, ORIGIN, DESTINATION, DEPARTUREDATE, ECONOMYCLASSAVAILABLE, BUSINESSCLASSAVAILABLE FROM FLIGHT WHERE ORIGIN = ? AND DESTINATION = ? AND DEPARTUREDATE = ?");
			Date date = Date.valueOf(departureDate);
			ps.setString(1, origin);
			ps.setString(2, destination);
			ps.setDate(3, date);
			System.out.println("print");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				newFlight = new Flight(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
				flightList.add(newFlight);
			}
		}
		
		catch(SQLException e) {
			e.getStackTrace();
		}
		return flightList;
	}

	@Override
	public int getEconomySeat(String origin, String destination, String departureDate) {
		// TODO Auto-generated method stub
		int seats = 0;
		try {
			Connection con = ConnectionUtil.getConnection();
			
			PreparedStatement ps = con.prepareStatement("SELECT ECONOMYCLASSAVAILABLE FROM FLIGHT WHERE ORIGIN = ? AND DESTINATION = ? AND DEPARTUREDATE = ?");
			Date date = Date.valueOf(departureDate);
			ps.setString(1, origin);
			ps.setString(2, destination);
			ps.setDate(3, date);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				seats = seats+rs.getInt(1);
			}
		}
		catch(SQLException e) {
			e.getLocalizedMessage();
		}
		return seats;
	}

	@Override
	public List<Passenger> getPassengerList(int flightid) {
		List<Passenger> passengerList = new ArrayList<Passenger>();
		Passenger passenger = null;
		
		try {
			Connection con = ConnectionUtil.getConnection();
			
			PreparedStatement ps = con.prepareStatement("SELECT PASSENGER.PASSENGERID, PASSENGERNAME, CITY FROM PASSENGER JOIN BOOKING ON BOOKING.PASSENGERID = PASSENGER.PASSENGERID WHERE BOOKING.FLIGHTID = ? ORDER BY PASSENGER.PASSENGERID");
			ps.setInt(1, flightid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				passenger = new Passenger(rs.getInt(1),rs.getString(2),rs.getString(3));
				passengerList.add(passenger);
			}
			con.close();
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
		
		return passengerList;
	}

	@Override
	public List<City> getCityList() {
		List<City> cityList = new ArrayList<City>();
		
		City city = null;
		
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT CITY, COUNT(*) AS PAS FROM PASSENGER GROUP BY CITY ORDER BY PAS DESC");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				city = new City(rs.getString(1),rs.getInt(2));
				cityList.add(city);
			}
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
		return cityList;
	}

	
//	public String getFlight(String origin, String destination) {
//		String flight = null;
//		
//		try {
//			Connection con = ConnectionUtil.getConnection();
//			
//			PreparedStatement ps = con.prepareStatement("")
//		}
//		catch(SQLException e) {
//			e.getStackTrace();
//		}
//		return null;
//	}
	
	

}

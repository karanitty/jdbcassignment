package com.ibsplc.jdbc.assignment1;

import java.util.ArrayList;
import java.util.List;

public class FlightReservationDAOTest {

	public static void main(String[] args) {
		
		FlightReservationDAO dao = new FlightReservationDAOImpl();
		
//		boolean add = dao.bookTicket(102,2, "COK", "BOM", "2022-08-22", 15000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(103,3, "COK", "BOM", "2022-08-22", 10000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(104,4, "COK", "BLR", "2022-08-23", 10000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(105,5, "TRV", "BOM", "2022-08-25", 15000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(106,6, "DEL", "HYD", "2022-08-24", 5000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(107,2, "DEL", "BLR", "2022-08-26", 8000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(108,7, "COK", "BOM", "2022-08-22", 15000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(109,8, "DEL", "MAA", "2022-08-24", 15000);
//		System.out.println(add);
		
//		boolean add = dao.bookTicket(103, 2, "TRV" , "HYD", "2022-08-23", 15000);
//		System.out.println(add);
		
//		boolean add = dao.bookTicket(110,8, "COK", "BOM", "2022-08-24", 20000);
//		System.out.println(add);
//		
//		add = dao.bookTicket(111,10, "COK", "BOM", "2022-08-24", 15000);
//		System.out.println(add);
		
//		boolean add = dao.registerPassenger(3, "BONNY" , "KOTTAYAM");
//		System.out.println(add);
		
//		List<Flight> flightList = new ArrayList<Flight>();
//		flightList = dao.getFlight("COK", "BOM", "2022-08-22");
//		flightList.forEach(p ->{
//			System.out.println(p);
//		});
		
//		int seats = dao.getEconomySeat("COK", "BOM", "2022-08-22");
//		System.out.println("Number of Economy seats available are " + seats);
		
//		List<Passenger> passengerList = new ArrayList<Passenger>();
//		passengerList = dao.getPassengerList(1001);
//		
//		passengerList.forEach(p ->{
//			System.out.println(p);
//		});
		
		List<City> cityList = new ArrayList<City>();
		cityList = dao.getCityList();
		
		cityList.forEach(p ->{
			System.out.println(p);
		});
		
	}
}

package com.ibsplc.jdbc.assignment1;

import java.util.ArrayList;
import java.util.List;

public class FlightReservationDAOTest {

	public static void main(String[] args) {
		
		FlightReservationDAO dao = new FlightReservationDAOImpl();
		
//		boolean add = dao.bookTicket(101,1, "COK", "BOM", "2022-08-22", 10000);
//		System.out.println(add);
		
//		boolean add = dao.registerPassenger(2, "DAVID" , "KOTTAYAM");
//		System.out.println(add);
		
		List<Flight> flightList = new ArrayList<Flight>();
		flightList = dao.getFlight("COK", "BOM", "2022-08-22");
		flightList.forEach(p ->{
			System.out.println(p);
		});
	}
}

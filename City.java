package com.ibsplc.jdbc.assignment1;

public class City {
	
	String cityName;
	int count;
	
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public City(String cityName, int count) {
		super();
		this.cityName = cityName;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", count=" + count + "]";
	}

}

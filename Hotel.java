package com.Hotel;

public class Hotel 
{
//use   getter setter method
	private String hotelName;
	private int ratePerDay;

	public String getHotelName() 
	{
		return hotelName;
	}

	public void setHotelName(String hotelName) 
	{
		this.hotelName = hotelName;
	}

	public int getRatePerDay() 
	{
		return ratePerDay;
	}

	public void setRatePerDay(int ratePerDay) 
	{
		this.ratePerDay = ratePerDay;
	}
//to string method
	@Override
	public String toString()
	{
		return "Hotel{" + "hotelName='" + hotelName + '\'' + ", ratePerDay=" + ratePerDay + '}';
	}
}

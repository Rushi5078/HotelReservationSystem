* 
 */
package com.Hotel;

import java.util.ArrayList;
/**
 * @author RUSHIKESHBHOSLE
 *
 */
public class HotelReservations 
{
   static ArrayList<Hotel> HotelsList = new ArrayList<>();

     public static void main(String[] args) 
	{

        Hotel LakeWood = new Hotel();
		LakeWood.setHotelName("LakeWood");
		LakeWood.setRatePerDay(110);
		HotelsList.add(LakeWood);

		Hotel RidgeWood = new Hotel();
		RidgeWood.setHotelName("RidgeWood");
		RidgeWood.setRatePerDay(150);
		HotelsList.add(RidgeWood);

		Hotel BridgeWood = new Hotel();
		BridgeWood.setHotelName("BridgeWood");
		BridgeWood.setRatePerDay(220);
		HotelsList.add(BridgeWood);

		
		System.out.println(HotelsList);
	}

}



 

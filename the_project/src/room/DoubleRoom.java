package room;

import enumeration.*;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

/**
 * DoubleRoom as a subclass of Room class, Double room as a type of room with attributes specific to Double rooms;
 */

public class DoubleRoom extends Room{
	
	/**
	 * # Constructor
	 */
	/**
	 * Calls the Room constructor;
	 * Sets this roomType to DOUBLE, sets this roomNumber, sets maxOccupancy of this Double room to 2, 
	 * sets availability of this Double room to VACANT and menu of this Double room to Menu object passed in;
	 * 
	 * @param menu Menu object containing food items available to this Double room for room service;
	 * @param bedType type of bed in this Double room, used to initialize RoomFeatures;
	 * @param viewType type of view of this Double room, used to initialize RoomFeatures;
	 * @param numOfBed number of beds in this Double room, used to initialize RoomFeatures;
	 * @param wiFi availability of wifi in this Double room, used to initialize RoomFeatures;
	 * @param smokeOut presence of a smokeout in this Double room, used to initialize RoomFeatures;
	 * @param weekDayPrice charged price of staying in this Double room on a weekday for guest(s), used to initialize RoomRate;
	 * @param weekEndPrice charged price of staying in this Double room on a weekend for guest(s), used to initialize RoomRate;
	 */
	public DoubleRoom(Menu menu, int floor, int num, TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wiFi, boolean smokeOut, double weekDayPrice, double weekEndPrice) {
		
		super(menu, bedType, viewType, numOfBed, wiFi, smokeOut, weekDayPrice, weekEndPrice);			

		//Overriding attributes of super()
		this.roomType = TypeOfRoom.DOUBLE;
		
		//Getting the correct form for room number
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 2;
		this.availability = AvailStatus.VACANT;
		this.menu = menu;
	}
}

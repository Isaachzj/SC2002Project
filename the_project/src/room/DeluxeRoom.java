package room;

import enumeration.*;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

/**
 * DeluxeRoom as a subclass of Room class, Deluxe room as a type of room with attributes specific to Deluxe rooms;
 */

public class DeluxeRoom extends Room{
	/**
	 * # Constructor
	 */
	/**
	 * Calls the Room constructor;
	 * Sets this roomType to DELUXE, sets this roomNumber, sets maxOccupancy of this Deluxe room to 3, 
	 * sets availability of this Deluxe room to VACANT and menu of this Deluxe room to Menu object passed in;
	 * 
	 * @param menu Menu object containing food items available to this Deluxe room for room service;
	 * @param bedType type of bed in this Deluxe room, used to initialize RoomFeatures;
	 * @param viewType type of view of this Deluxe room, used to initialize RoomFeatures;
	 * @param numOfBed number of beds in this Deluxe room, used to initialize RoomFeatures;
	 * @param wiFi availability of wifi in this Deluxe room, used to initialize RoomFeatures;
	 * @param smokeOut presence of a smokeout in this Deluxe room, used to initialize RoomFeatures;
	 * @param weekDayPrice charged price of staying in this Deluxe room on a weekday for guest(s), used to initialize RoomRate;
	 * @param weekEndPrice charged price of staying in this Deluxe room on a weekend for guest(s), used to initialize RoomRate;
	 */
	public DeluxeRoom(Menu menu, int floor, int num, TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wiFi, boolean smokeOut, double weekDayPrice, double weekEndPrice) {
		//Calling superclass constructor (Room constructor)
		super(menu, bedType, viewType, numOfBed, wiFi, smokeOut, weekDayPrice, weekEndPrice);		
		
		/**
		 * # Overriding attributes of super()
		 */
		this.roomType = TypeOfRoom.DELUXE;
		
		/**
		 * # Getting the correct form for room number
		 */
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 3;
		this.availability = AvailStatus.VACANT;
		this.menu = menu;
	}
}

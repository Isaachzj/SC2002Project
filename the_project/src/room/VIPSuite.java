package room;

import enumeration.*;
import food_related.*;

/**
 * VIPSuite as a subclass of Room class, VIP Suite room as a type of room with attributes specific to VIP Suite rooms;
 */

public class VIPSuite extends Room {
	/**
	 * # Constructor
	 */
	/**
	 * Calls the Room constructor;
	 * Sets this roomType to VIPSUITE, sets this roomNumber, sets maxOccupancy of this Double room to 4, 
	 * sets availability of this VIP Suite room to VACANT and menu of this VIP Suite to Menu object passed in;
	 * 
	 * @param menu Menu object containing food items available to this VIP Suite room for room service;
	 * @param bedType type of bed in this VIP Suite room, used to initialize RoomFeatures;
	 * @param viewType type of view of this VIP Suite room, used to initialize RoomFeatures;
	 * @param numOfBed number of beds in this VIP Suite room, used to initialize RoomFeatures;
	 * @param wiFi availability of wifi in this VIP Suite room, used to initialize RoomFeatures;
	 * @param smokeOut presence of a smokeout in this VIP Suite room, used to initialize RoomFeatures;
	 * @param weekDayPrice charged price of staying in this VIP Suite room on a weekday for guest(s), used to initialize RoomRate;
	 * @param weekEndPrice charged price of staying in this VIP Suite room on a weekend for guest(s), used to initialize RoomRate;
	 */
	public VIPSuite(Menu menu, int floor, int num) {
		//Calling superclass constructor (Room constructor)
		super(menu, TypeOfBed.KING , ViewType.OCEAN, 1, true, false, 250, 350);	
		
		//Overriding attributes of super()
		this.roomType = TypeOfRoom.VIPSUITE;
		
		//Getting the correct form for room number
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 4;
		this.availability = AvailStatus.VACANT;
		this.menu = menu;
	}
}

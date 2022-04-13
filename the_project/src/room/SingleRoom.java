package room;

import enumeration.*;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

/**
 * SingleRoom as a subclass of Room class, Single room as a type of room with attributes specific to Single rooms;
 */

public class SingleRoom extends Room{
	
	/**
	 * # Constructor
	 */
	/**
	 * Calls the Room constructor;
	 * Sets this roomType to SINGLE, sets this roomNumber, sets maxOccupancy of this Double room to 1, 
	 * sets availability of this Single room to VACANT and menu of this Single room to Menu object passed in;
	 * 
	 * @param menu Menu object containing food items available to this Single room for room service;
	 * @param bedType type of bed in this Single room, used to initialize RoomFeatures;
	 * @param viewType type of view of this Single room, used to initialize RoomFeatures;
	 * @param numOfBed number of beds in this Single room, used to initialize RoomFeatures;
	 * @param wiFi availability of wifi in this Single room, used to initialize RoomFeatures;
	 * @param smokeOut presence of a smokeout in this Single room, used to initialize RoomFeatures;
	 * @param weekDayPrice charged price of staying in this Single room on a weekday for guest(s), used to initialize RoomRate;
	 * @param weekEndPrice charged price of staying in this Single room on a weekend for guest(s), used to initialize RoomRate;
	 */
	public SingleRoom(Menu menu, int floor, int num, TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wiFi, boolean smokeOut, double weekDayPrice, double weekEndPrice) {
		//Calling superclass constructor (Room constructor)
		super(menu, bedType, viewType, numOfBed, wiFi, smokeOut, weekDayPrice, weekEndPrice);		
		
		//Overriding attributes of super()
		this.roomType = TypeOfRoom.SINGLE;
		
		//Getting the correct form for room number
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 1;
		this.availability = AvailStatus.VACANT;
		this.menu = menu;
	}
}

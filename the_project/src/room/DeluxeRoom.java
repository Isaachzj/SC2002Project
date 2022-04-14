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
	 * @param floor of type int here refers to the floor number of the room, used to initialize roomNumber;
	 * @param num of type int here refers to the second number of the room, used to initialize roomNumber;
	 */
	public DeluxeRoom(Menu menu, int floor, int num) {
		//Calling superclass constructor (Room constructor)
		super(menu, TypeOfBed.QUEEN , ViewType.CITY, 1, true, false, 120, 150);		
		
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

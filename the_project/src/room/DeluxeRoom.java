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
	 * Instantiation of the DeluxeRoom object
	 * this includes details such as the menu available to the room, room floor and room number
	 * for the instantiation of the DeluxeRoom object, we have set the max occupancy to 3 (i.e. maximum of 3 guests that can stay in a give Deluxe Room)
	 * 
	 * @param menu	this is the Menu object containing Food available for the Deluxe room
	 * Menu object containing food items available to this Deluxe room for room service;
	 * @param floor	this is the room floor, which is required for the instantiation of the DeluxeRoom object
	 * @param num this is the room number, which is required for the instantiation of the DeluxeRoom object
	 */
	public DeluxeRoom(Menu menu, int floor, int num) {
		/**
		 * # Calling superclass constructor (Room constructor)
		 */
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

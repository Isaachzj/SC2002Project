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
	 * Instantiation of the SingleRoom object
	 * this includes details such as the menu available to the room, room floor and room number
	 * for the instantiation of the DeluxeRoom object, we have set the max occupancy to 1 (i.e. maximum of 1 guest that can stay in a give Double Room)
	 * 
	 * @param menu	this is the Menu object containing Food available for the Single room
	 * Menu object containing food items available to this Double room for room service;
	 * @param floor	this is the room floor, which is required for the instantiation of the SingleRoom object
	 * @param num this is the room number, which is required for the instantiation of the SingleRoom object
	 */
	public SingleRoom(Menu menu, int floor, int num) {
		/**
		 * # Calling superclass constructor (Room constructor)
		 */
		super(menu, TypeOfBed.SINGLE, ViewType.STANDARD, 1, true, false, 50, 80);		
		
		/**
		 * # Overriding attributes of super()
		 */
		this.roomType = TypeOfRoom.SINGLE;
		
		/**
		 * # Getting the correct form for room number
		 */
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 1;
		this.availability = AvailStatus.VACANT;
		this.menu = menu;
	}
}

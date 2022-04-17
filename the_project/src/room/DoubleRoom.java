package room;

import enumeration.*;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

/**
 * DoubleRoom as a subclass of Room class, Double room as a type of room
 * with attributes specific to Double rooms;
 * Instantiation of the DoubleRoom object
 * this includes details such as the menu available to the room, room floor and room number
 * for the instantiation of the DeluxeRoom object, we have set the max occupancy to 2
 * (i.e. maximum of 2 guests that can stay in a give Double Room)
 */

public class DoubleRoom extends Room{
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of DoubleRoom object with input menu object,
	 * floor number and room number;
	 * Follows the Single Dependency principle as sole responsibility
	 * is to create a DoubleRoom object;
	 * Follows the Liskov Substitution principle 
	 * @param menu Menu object that has food list available for room service of this room
	 * @param floor floor number of this room
	 * @param num room number of this room
	 */
	public DoubleRoom(Menu menu, int floor, int num) {
		
		super(menu, TypeOfBed.SINGLE, ViewType.STANDARD, 2, true, false, 80, 100);			
		
		/**
		 * # Overriding attributes of super()
		 */
		this.roomType = TypeOfRoom.DOUBLE;
		
		/**
		 * # Getting the correct form for room number
		 */
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 2;
		this.availability = AvailStatus.VACANT;
		this.menu = menu;
	}
}

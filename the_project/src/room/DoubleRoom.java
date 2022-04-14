package room;

import enumeration.*;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

/**
 * DoubleRoom as a subclass of Room class, Double room as a type of room with attributes specific to Double rooms;
 */

public class DoubleRoom extends Room{
<<<<<<< Updated upstream
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of the DoubleRoom object
	 * this includes details such as the menu available to the room, room floor and room number
	 * for the instantiation of the DeluxeRoom object, we have set the max occupancy to 2 (i.e. maximum of 2 guests that can stay in a give Double Room)
	 * 
	 * @param menu	this is the Menu object containing Food available for the Double room
	 * Menu object containing food items available to this Double room for room service;
	 * @param floor	this is the room floor, which is required for the instantiation of the DoubleRoom object
	 * @param num this is the room number, which is required for the instantiation of the DoubleRoom object
=======
	/**
	 * Instantiation of DoubleRoom object with input menu object, floor number and room number;
	 * Follows the Single Dependency principle as sole responsibility is to create a DoubleRoom object;
	 * Follows the Liskov Substitution principle 
	 * @param menu Menu object that has food list available for room service of this room
	 * @param floor floor number of this room
	 * @param num room number of this room
>>>>>>> Stashed changes
	 */
	public DoubleRoom(Menu menu, int floor, int num) {
		
<<<<<<< Updated upstream
		super(menu, TypeOfBed.SINGLE, ViewType.STANDARD, 2, true, false, 80, 100);			
=======
		// Instantiating necessary objects
		/** 
		 * Instantiation of RoomFeatures object with input bed type, view type, number of beds, wifi availability and smokeout availability;
		 * Follows the Single Dependency principle as sole responsibility is to create a Food object
		 * Also follows the Open-Closed principle as changes in the Display does not require a change in source code of modules
		 */
		RoomFeatures ff = new RoomFeatures(TypeOfBed.SINGLE , ViewType.STANDARD, 1, true, false);
		RoomRate rr = new RoomRate(50, 80, 0);
>>>>>>> Stashed changes

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

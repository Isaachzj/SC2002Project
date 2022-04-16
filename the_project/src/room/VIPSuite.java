package room;

import enumeration.*;
import food_related.*;

/**
 * VIPSuite as a subclass of Room class, VIP Suite room as a type of room
 * with attributes specific to VIP Suite rooms;
 */

public class VIPSuite extends Room {
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of the VIPSuite object
	 * this includes details such as the menu available to the room, room floor and room number
	 * for the instantiation of the VIPSuite object, we have set the max occupancy to 1
	 * (i.e. maximum of 4 guests that can stay in a give Double Room)
	 * 
	 * @param menu	this is the Menu object containing Food available for the VIP Suite room
	 * Menu object containing food items available to this VIP Suite room for room service;
	 * @param floor	this is the room floor, which is required
	 * for the instantiation of the VIPSuite object
	 * @param num this is the room number, which is required
	 * for the instantiation of the VIPSuite object
	 */
	public VIPSuite(Menu menu, int floor, int num) {
		/**
		 * # Calling superclass constructor (Room constructor)
		 */
		super(menu, TypeOfBed.KING , ViewType.OCEAN, 1, true, false, 250, 350);	
		
		/**
		 * # Overriding attributes of super()
		 */
		this.roomType = TypeOfRoom.VIPSUITE;
		
		/**
		 * # Getting the correct form for room number
		 */
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 4;
		this.availability = AvailStatus.VACANT;
		this.menu = menu;
	}
}

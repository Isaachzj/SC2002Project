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
	 * @param floor of type int here refers to the floor number of the room, used to initialize roomNumber;
	 * @param num of type int here refers to the second number of the room, used to initialize roomNumber;
	 */
	public SingleRoom(Menu menu, int floor, int num) {
		//Calling superclass constructor (Room constructor)
		super(menu, TypeOfBed.SINGLE, ViewType.STANDARD, 1, true, false, 50, 80);		
		
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

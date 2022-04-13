package room;

import enumeration.*;
import food_related.*;

public class VIPSuite extends Room {
	public VIPSuite(Menu menu, int floor, int num, TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wiFi, boolean smokeOut, double weekDayPrice, double weekEndPrice) {
		//Calling superclass constructor (Room constructor)
		super(menu, bedType, viewType, numOfBed, wiFi, smokeOut, weekDayPrice, weekEndPrice);	
		
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

package room;

import enumeration.*;
import food_related.*;
import room_features.RoomFeatures;
import room_rate.RoomRate;

public class VIPSuite extends Room {
	public VIPSuite(Menu menu, int floor, int num) {
		super(menu);		

		// Instantiating necessary objects
		RoomFeatures ff = new RoomFeatures(TypeOfBed.KING , ViewType.OCEAN, 1, true, false);
		RoomRate rr = new RoomRate(50, 80, 0);
		
		//Overriding attributes of super()
		this.roomType = TypeOfRoom.VIPSUITE;
		
		//Getting the correct form for room number
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 4;
		this.availability = AvailStatus.VACANT;
		this.feature = ff;
		this.rate = rr;
		this.menu = menu;
	}
}

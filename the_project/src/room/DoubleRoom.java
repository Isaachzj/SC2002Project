package room;

import enumeration.*;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

public class DoubleRoom extends Room{
	public DoubleRoom(Menu menu, int floor, int num) {
		super(menu);		
		
		// Instantiating necessary objects
		RoomFeatures ff = new RoomFeatures(TypeOfBed.SINGLE , ViewType.STANDARD, 1, true, false);
		RoomRate rr = new RoomRate(50, 80, 0);

		//Overriding attributes of super()
		this.roomType = TypeOfRoom.DOUBLE;
		
		//Getting the correct form for room number
		if (num<10)
			this.roomNumber = '0'+String.valueOf(floor)+'0'+String.valueOf(num);
		else
			this.roomNumber = '0'+String.valueOf(floor)+String.valueOf(num);
		
		this.maxOccupancy = 2;
		this.availability = AvailStatus.VACANT;
		this.feature = ff;
		this.rate = rr;
		this.menu = menu;
	}
}

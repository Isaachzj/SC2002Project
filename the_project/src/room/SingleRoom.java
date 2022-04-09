package room;

import enumeration.*;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

public class SingleRoom extends Room{
	public SingleRoom(Menu menu, int floor, int num) {
		super(menu);		
		
		// Instantiating necessary objects
		RoomFeatures ff = new RoomFeatures(TypeOfBed.SINGLE , ViewType.STANDARD, 1, true, false);
		RoomRate rr = new RoomRate(50, 80, 0);
		
		//Overriding attributes of super()
		this.roomType = TypeOfRoom.SINGLE;
		this.roomFloor = floor;
		this.roomNumber = num;
		this.maxOccupancy = 1;
		this.availability = AvailStatus.VACANT;
		this.feature = ff;
		this.rate = rr;
		this.menu = menu;
	}
}

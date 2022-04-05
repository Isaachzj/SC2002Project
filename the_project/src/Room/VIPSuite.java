package Room;

import enumeration.*;
import food_related.*;
import room_features.RoomFeatures;
import room_rate.RoomRate;

public class VIPSuite extends Room {
	public VIPSuite(int floor, int num) {
		super();		
		//Single Room Food
		String food1 = "T-bone steak";
		double price1 = 32.00;
		String des1 = "Freshly imported from Australia!";
		
		String food2 = "Lobster Thermidor";
		double price2 = 48.00;
		String des2 = "Must buy for lobster fans!";
		
		String food3 = "King Crab";
		double price3 = 125.00;
		String des3 = "Wild caught from the Atlantic!";
		
		String food4 = "Foie Gras";
		double price4 = 30.00;
		String des4 = "Not Grass!";
		
		String food5 = "Unagi";
		double price5 = 28.00;
		String des5 = "Not from Don Don Donki!";
		
		// Instantiating necessary objects
		RoomFeatures ff = new RoomFeatures(TypeOfBed.KING , ViewType.OCEAN, 1, true, false);
		RoomRate rr = new RoomRate(50, 80, 0);

		
		Food f1 = new Food(food1, price1, des1);
		Food f2 = new Food(food2, price2, des2);
		Food f3 = new Food(food3, price3, des3);
		Food f4 = new Food(food4, price4, des4);
		Food f5 = new Food(food5, price5, des5);

		Menu mm = new Menu(f1, f2, f3, f4, f5);
		
		//Overriding attributes of super()
		this.roomType = TypeOfRoom.VIPSUITE;
		this.roomFloor = floor;
		this.roomNumber = num;
		this.maxOccupancy = 4;
		this.availability = AvailStatus.VACANT;
		this.feature = ff;
		this.rate = rr;
		this.menuList = mm;
	}
}

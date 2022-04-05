package Room;

import enumeration.AvailStatus;
import enumeration.TypeOfBed;
import enumeration.TypeOfRoom;
import enumeration.ViewType;
import food_related.Food;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

public class DeluxeRoom extends Room{
	public DeluxeRoom(int floor, int num) {
		super();		
		//Single Room Food
		String food1 = "Abalone Noodle";
		double price1 = 18.00;
		String des1 = "Freshly caught from the Ocean!";
		
		String food2 = "Olive Fried Rice";
		double price2 = 15.00;
		String des2 = "Number 1 in Singapore!";
		
		String food3 = "Ribeye Steak";
		double price3 = 28.00;
		String des3 = "Free-range beef!";
		
		String food4 = "Pasta";
		double price4 = 15.00;
		String des4 = "Pastamania!";
		
		String food5 = "Salmon Don";
		double price5 = 20.00;
		String des5 = "Not from Don Don Donki!";
		
		// Instantiating necessary objects
		RoomFeatures ff = new RoomFeatures(TypeOfBed.QUEEN , ViewType.CITY, 1, true, false);
		RoomRate rr = new RoomRate(50, 80, 0);

		
		Food f1 = new Food(food1, price1, des1);
		Food f2 = new Food(food2, price2, des2);
		Food f3 = new Food(food3, price3, des3);
		Food f4 = new Food(food4, price4, des4);
		Food f5 = new Food(food5, price5, des5);

		Menu mm = new Menu(f1, f2, f3, f4, f5);
		
		//Overriding attributes of super()
		this.roomType = TypeOfRoom.DELUXE;
		this.roomFloor = floor;
		this.roomNumber = num;
		this.maxOccupancy = 3;
		this.availability = AvailStatus.VACANT;
		this.feature = ff;
		this.rate = rr;
		this.menuList = mm;
	}
}

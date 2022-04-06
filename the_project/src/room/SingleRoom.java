package room;

import enumeration.AvailStatus;
import enumeration.TypeOfBed;
import enumeration.TypeOfRoom;
import enumeration.ViewType;
import food_related.Food;
import food_related.Menu;
import room_features.RoomFeatures;
import room_rate.RoomRate;

public class SingleRoom extends Room{
	public SingleRoom(int floor, int num) {
		super();		
		//Single Room Food
		String food1 = "Chicken Rice";
		double price1 = 5.00;
		String des1 = "Best Chicken Rice you've ever had!";
		
		String food2 = "Braised Duck Rice";
		double price2 = 7.00;
		String des2 = "Best Duck Rice you've ever had!";
		
		String food3 = "Roasted Duck Rice";
		double price3 = 8.00;
		String des3 = "Duck is irish!";
		
		String food4 = "Curry Chicken Rice";
		double price4 = 8.00;
		String des4 = "Definitely better than New York Time's version!";
		
		String food5 = "Hor Fun";
		double price5 = 8.00;
		String des5 = "Soooo Fun!";
		
		// Instantiating necessary objects
		RoomFeatures ff = new RoomFeatures(TypeOfBed.SINGLE , ViewType.STANDARD, 1, true, false);
		RoomRate rr = new RoomRate(50, 80, 0);

		
		Food f1 = new Food(food1, price1, des1);
		Food f2 = new Food(food2, price2, des2);
		Food f3 = new Food(food3, price3, des3);
		Food f4 = new Food(food4, price4, des4);
		Food f5 = new Food(food5, price5, des5);

		Menu mm = new Menu(f1, f2, f3, f4, f5);
	
		
		//Overriding attributes of super()
		this.roomType = TypeOfRoom.SINGLE;
		this.roomFloor = floor;
		this.roomNumber = num;
		this.maxOccupancy = 1;
		this.availability = AvailStatus.VACANT;
		this.feature = ff;
		this.rate = rr;
		this.menuList = mm;
	}
}

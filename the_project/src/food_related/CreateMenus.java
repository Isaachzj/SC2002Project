package food_related;

import java.util.ArrayList;

public class CreateMenus {
	/**
	 * Instantiation of Menu
	 * The Array list of all Menu of the Food from 'Single', 'Double', 'Deluxe' and 'VIP'
	 * Food item also has been instantiated into the Menu of Food respectively
	 * 
	 * We instantiated the Menu of Food for the respective types of rooms as different room types may have different menus 
	 * (i.e. 'Single' may have only basic menu whereas 'VIP' may have menus with more options)
	 * 
	 * Follows the Interface Segregation principle; since Classes do not depend on interfaces that they do not use
	 * @return the Array list of all Menu of the Food
	 * this includes the Array list of all Menu of the Food from 'Single', 'Double', 'Deluxe' and 'VIP'
	 */
	public static ArrayList<Menu> createMenus(){
		ArrayList<Menu> allMenus = new ArrayList<Menu>();
		
		String food1 = "Chicken Rice";
		double price1 = 5.00;
		String des1 = "Best Chicken Rice you've ever had!";
		int dur1 = 5;
		
		String food2 = "Braised Duck Rice";
		double price2 = 7.00;
		String des2 = "Best Duck Rice you've ever had!";
		int dur2 = 5;
		
		String food3 = "Roasted Duck Rice";
		double price3 = 8.00;
		String des3 = "Duck is irish!";
		int dur3 = 5;
		
		String food4 = "Curry Chicken Rice";
		double price4 = 8.00;
		String des4 = "Definitely better than New York Time's version!";
		int dur4 = 10;
		
		String food5 = "Hor Fun";
		double price5 = 8.00;
		String des5 = "Soooo Fun!";
		int dur5 = 10;
		
		String food6 = "T-bone steak";
		double price6 = 32.00;
		String des6 = "Freshly imported from Australia!";
		int dur6 = 15;
		
		String food7 = "Lobster Thermidor";
		double price7 = 48.00;
		String des7 = "Must buy for lobster fans!";
		int dur7 = 30;
		
		String food8 = "King Crab";
		double price8 = 125.00;
		String des8 = "Wild caught from the Atlantic!";
		int dur8 = 40;
		
		String food9 = "Foie Gras";
		double price9 = 30.00;
		String des9 = "Not Grass!";
		int dur9 = 15;
		
		String food10 = "Unagi";
		double price10 = 28.00;
		String des10 = "Not from Don Don Donki!";
		int dur10 = 10;
		
		String food11 = "Abalone Noodle";
		double price11 = 18.00;
		String des11 = "Freshly caught from the Ocean!";
		int dur11 = 10;
		
		String food12 = "Olive Fried Rice";
		double price12 = 15.00;
		String des12 = "Number 1 in Singapore!";
		int dur12 = 15;
		
		String food13 = "Ribeye Steak";
		double price13 = 28.00;
		String des13 = "Free-range beef!";
		int dur13 = 15;
		
		String food14 = "Pasta";
		double price14 = 15.00;
		String des14 = "Pastamania!";
		int dur14 = 10;
		
		String food15 = "Salmon Don";
		double price15 = 20.00;
		String des15 = "Not from Don Don Donki!";
		int dur15 = 10;
		

		/**
		 * Instantiating all Food
		 */
		Food f1 = new Food(food1, price1, des1,dur1);
		Food f2 = new Food(food2, price2, des2,dur2);
		Food f3 = new Food(food3, price3, des3,dur3);
		Food f4 = new Food(food4, price4, des4,dur4);
		Food f5 = new Food(food5, price5, des5,dur5);
		Food f6 = new Food(food6, price6, des6,dur6);
		Food f7 = new Food(food7, price7, des7,dur7);
		Food f8 = new Food(food8, price8, des8,dur8);
		Food f9 = new Food(food9, price9, des9,dur9);
		Food f10 = new Food(food10, price10, des10,dur10);
		Food f11 = new Food(food11, price11, des11,dur11);
		Food f12 = new Food(food12, price12, des12,dur12);
		Food f13 = new Food(food13, price13, des13,dur13);
		Food f14 = new Food(food14, price14, des14,dur14);
		Food f15 = new Food(food15, price15, des15,dur15);
		
		/**
		 * Instantiating the 4 different Menus
		 */
		Menu menuSingle = new Menu(f1, f2, f3, f4, f5);
		Menu menuDouble = new Menu(f1, f2, f3, f4, f5);
		Menu menuDeluxe = new Menu(f11, f12, f13, f14, f15);
		Menu menuVIP = new Menu(f6, f7, f8, f9, f10);
		
		allMenus.add(menuSingle);
		allMenus.add(menuDouble);
		allMenus.add(menuDeluxe);
		allMenus.add(menuVIP);
		
		return allMenus;
	}
}

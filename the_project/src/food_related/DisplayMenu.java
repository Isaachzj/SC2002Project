package food_related;
import list_methods.*;

public class DisplayMenu implements Print {
	private Menu menu;
	/**
	 * creates a DisplayMenu object and
	 * adds this menu into this DisplayMenu 
	 * @param menuList Menu object
	 */ 
	public DisplayMenu(Menu menuList) {
		this.menu = menuList;
	}
	
	//Overridding printArray() method in Print
	/**
	 * prints food items, index of food items, price of food items and description of food items in this menu
	 */ 
	public void printArray() {
		
		int size = menu.getNumOfFood();
		
		//printing menu
		System.out.println("===============Menu===============");
		System.out.println("Index-------Food Item-------Price-------Description");
		
		if (size==0) {System.out.println("Nothing available at the moment...");}
		for (int i=1; i<=size; i++) {
			Food food = menu.getArray().get(i-1);
			System.out.printf("%-12d%-10s%10.2f        %s\n", i, food.getFoodName(), food.getPrice(), food.getDescription());
		}
		System.out.println("==================================");
	}
}

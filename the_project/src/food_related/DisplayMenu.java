package food_related;
import list_methods.*;

public class DisplayMenu implements Print {
	private Menu menu;
	/**
	 * creates a DisplayMenu object and adds this menu into this DisplayMenu
	 * The DisplayMenu class follows the Single Responsibility principle, as has a sole responsibility of displaying the Menu 
	 * Additionally; it follows the Open-Closed principle as changes in the Display does not require a change in source code of modules
	 * (i.e. open for extensions but not modifications)
	 * It also follows the Dependency Injection principle as there are class for DisplayOrder and DisplayMenu
	 * @param menuList Menu object
	 */ 
	public DisplayMenu(Menu menuList) {
		this.menu = menuList;
	}
	
	//Overridding printArray() method in Print
	/**
	 * Overrides the printArray() method in Print
	 * this prints food items, index of food items, price of food items and description of food items in this menu
	 */ 
	public void printArray() {
		
		int size = menu.getNumOfFood();
		
		//printing menu
		System.out.println("===============Menu===============");
		System.out.println("Index----------Food Item--------------Price----------Description");
		
		if (size==0) {System.out.println("Nothing available at the moment...");}
		for (int i=1; i<=size; i++) {
			Food food = menu.getArray().get(i-1);
			System.out.printf("%-15d%-23s%-15.2f%-30s\n", i, food.getFoodName(), food.getPrice(), food.getDescription());
		}
		System.out.println("==================================");
	}
}

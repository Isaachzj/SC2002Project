package food_related;
import list_methods.*;
import java.util.Scanner;

/**
 * Instantiation of new food item details (food name, price and description) to 
 * be added into the Menu
 * Upon adding, checks if there are existing entries available for the new food item
 * If food entry is found, will check if food wants to be updated instead
 * getArray returns reference to ArrayList object
 * 
 * Allows existing food entry from the Menu to be removed
 * Upon removal, check if the item number exist in the Menu
 * If the item number requested for removal falls outside the Menu,
 * i.e. it does not exist in the Menu, then exception is throw and error message 
 * displaying that food entry does not exist
 * 
 * Modifications to existing food entries from the Menu
 * Prior to the modification of food entries, choice given to either modify 
 * the existing food price, description or both
 * If the new price or new description added is the same as before,
 * i.e. no changes to the existing food in the Menu, then Exception is thrown 
 * and error message displaying that price/ description is the same.
 * If none of the options chosen; message displaying for valid option to be chosen
 * Exception would be thrown if there are any errors encountered along the way 
 * (new price the same or new description the same)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class MenuManipulator implements AddStandard,RemoveStandard,Set, Get {
	
	/**
	 * This is the menu object to be manipulated
	 */
	private Menu menu; 
	
	/**
	 * # Constructor
	 */
	/**
	 * This Constructor follows the Single Responsibility principle
	 * Additionally, it follows the Open-Closed principle
	 * as its software entities is open for extension but closed for modifications
	 * @param menuList this is the menu list
	 */
	public MenuManipulator(Menu menuList) {
		this.menu = menuList;
	}
//============================================================================================================================================
	/**
	 * # For adding new Menu Items
	 */
	/**
	 * Instantiation of new food item details (food name, price and description) to 
	 * be added into the Menu
	 * Upon adding, checks if there are existing entries available for the new food item
	 * If food entry is found, will check if food wants to be updated instead
	 * getArray returns reference to ArrayList object
	 */
	public void addEntry() throws ArrayException{
		boolean found = false;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter new Food name:");
		String food_name = sc.nextLine();
		System.out.println("Enter new Food price:");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter description of Food:");
		String des = sc.nextLine();
		System.out.println("Enter the prepartion duration");
		int duration = sc.nextInt(); sc.nextLine();
		
		/**
		 * # Check if such an entry exists!
		 */
		for (int i=0; i<menu.getArray().size(); i++) {
			Food food = menu.getArray().get(i);
			if (food.getFoodName().compareTo(food_name) == 0) {
				found = true; int index = i;	
				break;
			}//end if
		}//end for
		
		if (found) throw new ArrayException("Food already exist! Do you want to update food entry instead?");
		/**
		 * Creates new Food which stores the details of the new food name, its price and its description
		 * @param   food_name this is the name of the new food
		 * @param   price this is the price of the new food
		 * @param   des this is the description of the new food
		*/
		Food new_food = new Food(food_name, price, des, duration);
		menu.getArray().add(new_food);	//getArray returns reference to ArrayList object
		menu.setNumOfFood(menu.getNumOfFood()+1);
	}
	
	
//============================================================================================================================================
	//Overriding removeList method in RemoveFood interface
	/**
	 * Allows existing food entry from the Menu to be removed
	 * Upon removal, check if the item number exist in the Menu
	 * If the item number requested for removal falls outside the Menu,
	 * i.e. it does not exist in the Menu, then exception is throw and error message 
	 * displaying that food entry does not exist
	*/
	public void removeEntry() throws ArrayException{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the item number:");
		int food_num = sc.nextInt(); sc.nextLine();
		
		if (food_num<=0 || food_num>menu.getArray().size()) 
			throw new ArrayException("No such food exists!!");
		
		//Removing food
		menu.getArray().remove(food_num-1);
		menu.setNumOfFood(menu.getNumOfFood()-1);
		return;
	}

//============================================================================================================================================
	//Overridden method in the Set interface
	/**
	 * Modifications to existing food entries from the Menu
	 * Prior to the modification of food entries, choice given to either modify 
	 * the existing food price, description or both
	 * If the new price or new description added is the same as before,
	 * i.e. no changes to the existing food in the Menu, then Exception is thrown 
	 * and error message displaying that price/ description is the same.
	 * If none of the options chosen; message displaying for valid option to be chosen
	 * Exception would be thrown if there are any errors encountered along the way 
	 * (new price the same or new description the same)
	*/
	public void set() throws ArrayException{
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		Food food = menu.getFood();
		
		do {
			System.out.println("Choose the following options:");
			System.out.println("1. Price only\n2. Description only\n3. Both Price and Description");
			choice = sc.nextInt(); sc.nextLine();
			
			switch(choice) {
			case (1):		
				/**
				 * Finding food entry in the array	
				 */
				System.out.println("Enter the new price:");
				double price = sc.nextDouble();
				sc.nextLine();
				
				/**
				 * throw exception if new price is the same as before
				 */
				if (food.getPrice() == price)
					throw new ArrayException("Price is the same!!");
				
				/**
				 * updating the price
				 */
				food.setPrice(price);
				return;
				
			case (2):				
						
				System.out.println("Enter the new description:");
				String ss = sc.nextLine();
				
				/**
				 * throw exception if description is the same as before
				 */
				if (ss.compareTo(food.getDescription())==0)
					throw new ArrayException("Description is the same!!");
				
				/**
				 * updating the price
				 */
				food.setDescription(ss);
				return;

			case(3):
						
				System.out.println("Enter the new description:");
				String string = sc.nextLine();	
				System.out.println("Enter the new price:");
				double pricey = sc.nextDouble();
				sc.nextLine();
				
				/**
				 * throw exception if new price is the same as before
				 */
				if (food.getPrice() == pricey)
					throw new ArrayException("Price is the same!!");
				/**
				 * throw exception if new description is the same as before
				 */
				if (string.compareTo(food.getDescription())==0)
					throw new ArrayException("Description is the same!!");
								
				/**updating the description and price
				 * 
				 */
				food.setDescription(string);
				food.setPrice(pricey);
				return;

			default:
				System.out.println("Choose a valid option!");
				
			}
		} while (choice<1 || choice>2);
			
	}//end set method

//============================================================================================================================================
	/**
     * Gets the food from the Menu with respect to the item number entered
     * @return this is the food from the Menu respective to the entered item number
    */
	public Food getEntry(){ 
		/** 
		 * for Room Service
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item number:");
		int food_num = sc.nextInt(); sc.nextLine();
		
		while (food_num<=0 || food_num>menu.getArray().size()) 
			{food_num = sc.nextInt(); sc.nextLine();}
	
		Food food = menu.getArray().get(food_num-1);
		return food;
	}
}//end class

package food_related;
import list_methods.*;
import java.util.Scanner;


public class MenuManipulator implements AddNew,RemoveStandard,Set, Get {
	private Menu menu; 
	
	//Constructor (For SRP)
	public MenuManipulator(Menu menuList) {
		this.menu = menuList;
	}
//============================================================================================================================================
	//For adding new Menu Items
	public void addList() throws ArrayException{
		boolean found = false;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter new Food name:");
		String food_name = sc.nextLine();
		System.out.println("Enter new Food price:");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter description of Food:");
		String des = sc.nextLine();
		
		//Check if such an entry exists!
		for (int i=0; i<menu.getArray().size(); i++) {
			Food food = menu.getArray().get(i);
			if (food.getFoodName().compareTo(food_name) == 0) {
				found = true; int index = i;	
				break;
			}//end if
		}//end for
		
		if (found) throw new ArrayException("Food already exist! Do you want to update food entry instead?");
		
		Food new_food = new Food(food_name, price, des);
		menu.getArray().add(new_food);	//getArray returns reference to ArrayList object
		menu.setNumOfFood(menu.getNumOfFood()+1);
	}
	
	/*
	//Overloaded addList method (For Room initial instantiation)
	public void addList(Food ff) {
		menu.getArray().add(ff);	//getArray returns reference to ArrayList object
		menu.setNumOfFood(menu.getNumOfFood()+1);
	}
	*/
//============================================================================================================================================
	//Overriding removeList method in RemoveFood interface
	public void removeEntry() throws ArrayException{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the item number:");
		int food_num = sc.nextInt();
		sc.nextLine();
		
		if (food_num<=0 || food_num>menu.getArray().size()) 
			throw new ArrayException("No such food exists!!");
		
		//Removing food
		menu.getArray().remove(food_num-1);
		menu.setNumOfFood(menu.getNumOfFood()-1);
		return;
	}

//============================================================================================================================================
	//Overridden method in the Set interface
	public void set() throws ArrayException{
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		Food food = menu.getFood();
		
		do {
			System.out.println("Choose the following options:");
			System.out.println("1. Price only\n2. Description only\n3. Both Price and Description");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case (1):		
				//Finding food entry in the array
						
				System.out.println("Enter the new price:");
				double price = sc.nextDouble();
				sc.nextLine();
				
				//throw exception if new price is the same as before
				if (food.getPrice() == price)
					throw new ArrayException("Price is the same!!");
				
				//updating the price
				food.setPrice(price);
				return;
				
			case (2):				
						
				System.out.println("Enter the new description:");
				String ss = sc.nextLine();
				
				//throw exception if new price is the same as before
				if (ss.compareTo(food.getDescription())==0)
					throw new ArrayException("Description is the same!!");
				
				//updating the price
				food.setDescription(ss);
				return;

			case(3):
						
				System.out.println("Enter the new description:");
				String string = sc.nextLine();	
				System.out.println("Enter the new price:");
				double pricey = sc.nextDouble();
				sc.nextLine();
				
				//throw exception if new price is the same as before
				if (food.getPrice() == pricey)
					throw new ArrayException("Price is the same!!");
				//throw exception if new price is the same as before
				if (string.compareTo(food.getDescription())==0)
					throw new ArrayException("Description is the same!!");
								
				//updating the description and price
				food.setDescription(string);
				food.setPrice(pricey);
				return;

			default:
				System.out.println("Choose a valid option!");
				
			}
		} while (choice<1 || choice>2);
			
	}//end set method

//============================================================================================================================================
	public Food getEntry(){ //For Room Service
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item number:");
		int food_num = sc.nextInt();
		sc.nextLine();
		
		while (food_num<=0 || food_num>menu.getArray().size()) 
			{food_num = sc.nextInt(); sc.nextLine();}
	
		Food food = menu.getArray().get(food_num-1);
		return food;
	}
}//end class

package food_related;
import java.util.ArrayList;
import list_methods.*;

public class Menu{
	/**
	 * list of food items in this Menu
	 */
	private ArrayList<Food> foodList;
	/**
	 * number of food items in this Menu
	 */
	private int numOfFood;
	
	//Constructor (NEED TO ADD 2 MORE TYPES OF FOOD LATER ON!
	/**
	 * To add 2 more types of food at a later stage
	 * Creates a new ArrayList of Food (Menu) and add the 5 Food items
	 * Follows the Single Responsibility principle as sole responsibility to add Food items into the ArrayList (Menu)
	 * Also follows the Open-Closed principle since the software entities is open for extension but closed for modifications
	 * @param f1 this is the first food for the Menu
	 * @param f2 this is the second food for the Menu
	 * @param f3 this is the third food for the Menu
	 * @param f4 this is the fourth food for the Menu
	 * @param f5 this is the fifth food for the Menu
	 */
	public Menu(Food f1, Food f2, Food f3, Food f4, Food f5) {
		this.foodList = new ArrayList<Food>();
		this.foodList.add(f1);
		this.foodList.add(f2);
		this.foodList.add(f3);
		this.foodList.add(f4);
		this.foodList.add(f5);
		this.numOfFood = 5;	
	}
	
	//get method
	/**
	 * @return list of food items available in this Menu
	 */
	protected ArrayList<Food> getArray() {return foodList;}	//returns reference
	/**
	 * @return number of food items available in this Menu
	 */
	protected int getNumOfFood() {return numOfFood;}			//returns value
	
	//set method
	/**
	 * sets number of food items in this Menu
	 */
	protected void setNumOfFood(int num) {this.numOfFood = num;}	

	/**
	 * creates a MenuManipulator object and adds a food item to this Menu
	 */
	public void addFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.addList();
	}
	
	/**
	 * creates a MenuManipulator object and removes a food item to this Menu
	 */ 
	public void removeFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.removeEntry();
	}
	
	/**
	 * creates a MenuManipulator object and updates a food item to this Menu
	 */
	public void updateFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.set();
	}
	
	/**
	 * creates a MenuManipulator object and gets a food item to this Menu
	 */
	public Food getFood() {
		MenuManipulator mm = new MenuManipulator(this);
		return mm.getEntry();
	}	
	
	/**
	 * creates a DisplayMenu object and prints the food items in this Menu
	 */
	public void info() {
		DisplayMenu dm = new DisplayMenu(this);
		dm.printArray();	
	}
	
}






/*if (roomType == TypeOfRoom.SINGLE) {
Food food1 = new Food("Claypot rice", 10.00);
Food food2 = new Food("Chicken rice", 6.00);
Food food3 = new Food("Fried rice", 6.00);
menuList.add(food1);
menuList.add(food2);
menuList.add(food3);
}

else if (roomType == TypeOfRoom.DOUBLE) {
Food food1 = new Food("Claypot rice", 10.00);
Food food2 = new Food("Chicken rice", 6.00);
Food food3 = new Food("Fried rice", 6.00);
menuList.add(food1);
menuList.add(food2);
menuList.add(food3);
}

else if (roomType == TypeOfRoom.DELUXE) {
Food food1 = new Food("Pineapple Fried rice", 10.00);
Food food2 = new Food("Olive Fried rice", 10.00);
Food food3 = new Food("Tomato Fried rice", 10.00);
menuList.add(food1);
menuList.add(food2);
menuList.add(food3);
}

else {
Food food1 = new Food("T-Bone steak", 30.00);
Food food2 = new Food("Truffle Fried Rice", 18.00);
Food food3 = new Food("Lobster Thermidor", 40.00);
menuList.add(food1);
menuList.add(food2);
menuList.add(food3);
}*/
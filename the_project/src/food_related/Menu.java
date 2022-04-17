package food_related;
import java.util.ArrayList;
import list_methods.*;

/**
 * Instantiation of Menu using Food items as parameter
 * Creates a new ArrayList of Food (Menu) and add the 5 Food items
 * to add 2 more types of food at a later stage. 
 * Follows the Single Responsibility principle as sole responsibility to 
 * add Food items into the ArrayList (Menu). 
 * Also follows the Open-Closed principle since the software entities is 
 * open for extension but closed for modifications.
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class Menu{
	/**
	 * list of food items in this Menu
	 */
	private ArrayList<Food> foodList;
	/**
	 * number of food items in this Menu (private attribute)
	 */
	private int numOfFood;
	
	/**
	 * Constructor
	 */
	/**
	 * Instantiation of Menu using Food items as parameter
	 * Creates a new ArrayList of Food (Menu) and add the 5 Food items
	 * to add 2 more types of food at a later stage
	 * Follows the Single Responsibility principle as sole responsibility to 
	 * add Food items into the ArrayList (Menu)
	 * Also follows the Open-Closed principle since the software entities is 
	 * open for extension but closed for modifications
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
	
	/**
	 * get method
	 * All methods are set to protected here
	 * this includes the food in menu and number of food
	 * this ensures better encapsulation of information while ensuring that
	 * the methods can be accessed by the same package and subclasses
	 */
	/**
	 * gets the Menu's list of food
	 * @return list of food items available in this Menu
	 */
	protected ArrayList<Food> getArray() {return foodList;}	//returns reference
	/**
	 * gets the Menu's number of food
	 * @return number of food items available in this Menu
	 */
	protected int getNumOfFood() {return numOfFood;}			//returns value
	
	/**
	 * set method
	 */
	/**
	 * sets number of food items in this Menu
	 */
	protected void setNumOfFood(int num) {this.numOfFood = num;}	

	/**
	 * creates a MenuManipulator object and adds a food item to this Menu
	 * @throws ArrayException occurs upon an error, calls array exception and throws a custom exception
	 */
	public void addFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.addEntry();
	}
	
	/**
	 * creates a MenuManipulator object and removes a food item to this Menu
	 * @throws ArrayException occurs upon an error, calls array exception and throws a custom exception
	 */ 
	public void removeFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.removeEntry();
	}
	
	/**
	 * creates a MenuManipulator object and updates a food item to this Menu
	 * @throws ArrayException occurs upon an error, calls array exception and throws a custom exception
	 */
	public void updateFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.set();
	}
	
	/**
	 * creates a MenuManipulator object and gets a food item to this Menu
	 * @return this is the Food object from the Menu (arraylist of food)
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

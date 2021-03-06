package food_related;
/**
 * Instantiation of Menu
 * The Array list of all Menu of the Food from 'Single', 'Double', 'Deluxe' and 'VIP'
 * Food item also has been instantiated into the Menu of Food respectively
 * 
 * Information encapsulation
 * All methods returned here are protected
 * this includes returning food name, description and price
 * this ensures better encapsulation of information while ensuring that the 
 * methods can be accessed by the same package and subclasses
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class Food {
	
	/**
	 * name of food object (private attribute)
	 */ 
	private String foodName;
	
	/**
	 * description of food object (private attribute)
	 */ 
	private String description;	
	
	/**
	 * price of food object (private attribute)
	 */ 
	private double price;
	
	/**
	 * preparation duration of food
	 */
	private int prepDuration;

	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of Food object with input name, price and description
	 * Follows the Single Dependency principle as sole responsibility is to create a Food object
	 * Also follows the Open-Closed principle as changes in the Display does not require a change in source code of modules
	 * @param	name this is the name of this food item
	 * @param	price this is the price of this food item
	 * @param	description this is the description of this food item
	 * @param	duration this is the duration of the food item
	 */ 
	public Food(String name, double price, String description, int duration) {
		this.foodName = name;
		this.price = price;
		this.description = description;
		this.prepDuration = duration;
	}
	/**
	 * returns a copy of Food source object
	 * @param source Food that is to copied
	 */
	
	public Food(Food source) {
		this.foodName = source.foodName;
		this.price = source.price;
		this.description = source.description;
		this.prepDuration = source.prepDuration;
	}
	
	/**
	 * get methods
	 * All methods returned here are protected
	 * this includes returning food name, description and price
	 * this ensures better encapsulation of information while ensuring that the
	 * methods can be accessed by the same package and subclasses
	 */
	/**
	 * gets the food item's name
	 * @return name of this food item
	 */ 
	protected String getFoodName() {return this.foodName;}
	/**
	 * 
	 * gets the food item's description
	 * @return description of this food item
	 */ 
	protected String getDescription() {return this.description;}
	/**
	 * gets the food item's price
	 * @return price of this food item
	 */ 
	protected double getPrice() {return this.price;}
	
	/**
	 * gets the duration needed to prepare this food
	 * @return the duration needed
	 */
	protected int getPrepDuration() {return this.prepDuration;}
	
	/**
	 * sets price of this food item
	 * @param price price of this food item
	 */ 
	protected void setPrice(double price) {this.price = price;}
	/**
	 * sets description of this food item
	 * @param description description of this food item
	 */ 
	protected void setDescription(String description) {this.description = description;}
}

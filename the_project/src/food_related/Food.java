package food_related;

public class Food {
	
	/**
	 * name of food item
	 */ 
	private String foodName;
	
	/**
	 * description of food item
	 */ 
	private String description;	
	
	/**
	 * price of food item
	 */ 
	private double price;

	//Constructor
	/**
	 * creates a Food object with input name, price and description
	 * @param name name of this food item
	 * @param price price of this food item
	 * @param description description of this food item
	 */ 
	public Food(String name, double price, String description) {
		this.foodName = name;
		this.price = price;
		this.description = description;
	}
	
	//get methods
	/**
	 * @return name of this food item
	 */ 
	protected String getFoodName() {return this.foodName;}
	/**
	 * @return description of this food item
	 */ 
	protected String getDescription() {return this.description;}
	/**
	 * @return price of this food item
	 */ 
	protected double getPrice() {return this.price;}
	
	//set method
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

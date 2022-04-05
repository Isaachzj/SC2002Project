package food_related;

public class Food {
	private String foodName;
	private String description;	
	private double price;

	//Constructor
	public Food(String name, double price, String description) {
		this.foodName = name;
		this.price = price;
		this.description = description;
	}
	
	//get methods
	protected String getFoodName() {return this.foodName;}
	protected String getDescription() {return this.description;}	
	protected double getPrice() {return this.price;}
	
	//set method
	protected void setPrice(double price) {this.price = price;}
	protected void setDescription(String description) {this.description = description;}
}

package food_related;
import java.util.ArrayList;
import list_methods.*;

public class Menu{
	private ArrayList<Food> foodList;
	private int numOfFood;
	
	//Constructor (NEED TO ADD 2 MORE TYPES OF FOOD LATER ON!
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
	protected ArrayList<Food> getArray() {return foodList;}	//returns reference
	protected int getNumOfFood() {return numOfFood;}			//returns value
	
	//set method
	protected void setNumOfFood(int num) {this.numOfFood = num;}	

	
	public void addFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.addList();
	}
	
	public void removeFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.removeEntry();
	}
	
	public void updateFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		mm.set();
	}
	
	public Food getFood() throws ArrayException {
		MenuManipulator mm = new MenuManipulator(this);
		return mm.getEntry();
	}	
	
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
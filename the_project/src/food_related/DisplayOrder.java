package food_related;

import list_methods.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DisplayOrder implements Print {
	private Order order;
	/**
	 * # Displays details of orders from order object
	 * creates a DisplayOrder object and adds this menu into this DisplayOrder 
	 * The DisplayOrder class follows the Single Responsibility principle, as has a sole responsibility of displaying the Order 
	 * @param	order this is the order of the customer
	 */ 
	public DisplayOrder(Order order) {
		this.order = order;
	}
	
	/**
	 * Overrides the printArray() method in Print
	 * If no orders taken, i.e. order array is empty - prints error message.
	 * Else, if orders available, prints out the details of the order (name, price and quantity of food items ordered)
	 */ 
	public void printArray() {
		/**
		 * Checks if the order array is empty
		 */
		if (order.getArray().size()==0) 
			System.out.println("--No orders taken!--");
		/**
		 * Else, if order is not empty; prints out the details of the order
		 */
		for (int i=1; i<=order.getArray().size(); i++) {
			Food food = order.getArray().get(i-1);
			System.out.printf("%-15d%-23s%-15.2f%-30d\n", i, food.getFoodName(), food.getPrice(), order.getQuantity().get(i-1));
		}
		System.out.printf("Remarks: %s\n", order.getRemarks());
		System.out.printf("Total Bill: %.2f\n", order.getBill());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm");
		System.out.println("Date and Time: " + order.getTimeStamp().format(formatter));
		return;
	}
}

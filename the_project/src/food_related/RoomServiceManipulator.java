package food_related;

import food_related.*;
import java.time.LocalDateTime;
import java.util.Scanner;

import enumeration.OrderStatus;
import list_methods.*;

public class RoomServiceManipulator implements AddGivenObject, Reset, Set {
	/**
	 * this is the RoomService (private attribute)
	 */
	private RoomService rs;
	
	
	/**
	 * This Constructor follows the Single Responsibility principle
	 * Additionally, it follows the Open-Closed principle as its software entities is open for extension but 
	 * closed for modifications
	 * @param   rs this is the Room Service of the guest
	*/
	public RoomServiceManipulator(RoomService rs) {
		this.rs = rs;
	}
	
	/**
	 * # Check prior to adding order entry
	 * Check if object passed to this function is actually a food object and if object passed is either null 
	 * or not an instance of a food object, an exception will be thrown and error message displayed
	 * If object passed to function is a food object, will add the food object into the food list
	 * @param   daOrder this is the food object
	*/
	public void addEntry(Object daOrder) throws ArrayException {
		Order order;
		
		/**
		 * For this case, we will actually ensure that only a food objectis passed to this function
		 * so this is actually uneeded but we kiasu :)
		 */
		/**
		 * Ensure that only a food object is passed to this function
		 */
		if (daOrder==null) {throw new ArrayException("Error!!");}
		else if (!(daOrder instanceof Order)) { throw new ArrayException("Error!!");}
		else {order = (Order) daOrder;} 
		
		rs.getArray().add(order);	
	}
	
	/**
	 * # To empty the Room Service Order List upon check out
	 */
	/**
	 * Empty the Room Service Order List whenever Guest check out from the Hotel
	*/
	public void resetArray(){
		if (rs.getArray().size()==0) 
			{System.out.println("- Order List was already empty!"); return;}
		
		rs.getArray().clear();
		System.out.println("- Order List is Cleared!");
	}
	
	/**
	 * This method sets the order statuses according to current time
	 */
	public void set() {
		//Traversing the array of orders
		for (int i=0; i<rs.getArray().size(); i++) {
			Order order = rs.getArray().get(i);
			LocalDateTime currentTime = LocalDateTime.now();
			//If order completion time has passed in real-time, update order status
			if (order.getTimeCompleted().isBefore(currentTime) && order.getOrderStatus()==OrderStatus.PREPARING) {
				order.setPreparationStauts(OrderStatus.COMPLETED);
			}	
		}
		
		return;
	}
}

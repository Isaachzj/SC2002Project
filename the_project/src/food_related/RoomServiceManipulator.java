package food_related;
import java.util.Scanner;

import list_methods.*;

public class RoomServiceManipulator implements AddGivenObject, Reset {
	private RoomService rs;
	/**
	 * Displays the room service of the guests
	 * @param   rs this is the Room Service of the guest
	*/
	public RoomServiceManipulator(RoomService rs) {
		this.rs = rs;
	}
	
	/**
	 * Check if object passed to this function is actually a food object and if object passed is either null or not an instance of a food object, an exception will be thrown and error message displayed
	 * If object passed to function is a food object, will add the food object into the food list
	 * @param   daOrder this is the food object
	*/
	public void addList(Object daOrder) throws ArrayException {
		Order order;
		
		//For this case, we will actually ensure that only a food object is passed to this function so this is actually uneeded but we kiasu :)
		if (daOrder==null) {throw new ArrayException("Error!!");}
		else if (!(daOrder instanceof Order)) { throw new ArrayException("Error!!");}
		else {order = (Order) daOrder;} 
		
		rs.getArray().add(order);	
	}
	
	//To empty the Room Service Order List upon check out
	/**
	 * Empty the Room Service Order List whenever Guest check out from the Hotel
	 * If the Room Service Order List is clear, it will display it accordingly
	*/
	public void resetList() throws ArrayException{
		if (rs.getArray().size()==0) 
			throw new ArrayException("Order List is cleared!!");
		
		rs.getArray().clear();
	}
}

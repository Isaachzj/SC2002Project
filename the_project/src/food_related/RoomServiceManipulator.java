package food_related;
import java.util.Scanner;

import list_methods.*;

public class RoomServiceManipulator implements AddGivenObject, Reset {
	private RoomService rs;
	
	public RoomServiceManipulator(RoomService rs) {
		this.rs = rs;
	}
	
	public void addList(Object daOrder) throws ArrayException {
		Order order;
		
		//For this case, we will actually ensure that only a food object is passed to this function so this is actually uneeded but we kiasu :)
		if (daOrder==null) {throw new ArrayException("Error!!");}
		else if (!(daOrder instanceof Order)) { throw new ArrayException("Error!!");}
		else {order = (Order) daOrder;} 
		
		rs.getArray().add(order);	
	}
	
	//To empty the Room Service Order List upon check out
	public void resetList() throws ArrayException{
		if (rs.getArray().size()==0) 
			throw new ArrayException("Order List is cleared!!");
		
		rs.getArray().clear();
	}
}

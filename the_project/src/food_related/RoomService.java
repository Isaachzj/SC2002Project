package food_related;
import java.util.ArrayList;
import list_methods.ArrayException;

/**
 * Follows the Interface Segregation principle; with instead of one big interface, many small interfaces 
 * based on groups of methods.
 * Includes methods required to RoomService such as get methods and set methods as well as adding orders. 
 * Method Encapsulation; 
 * We made it such that only methods returning roomServiceBill are public
 * this is made public as it is required to tabulate the grand total for the receipt
 * Methods returning food items of room service order and grand total of roomServiceBill are protected
 * this ensures better encapsulation of information while ensuring that the methods can be accessed by the
 * same package and subclasses
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class RoomService {
	/**
	 * list of food items guest in this room service order
	 */
	private ArrayList<Order> orderList;
	/**
	 * final bill/total price of this room service order (private attribute)
	 */
	private double roomServiceBill;
	
	/**
	 * creates a RoomService object and sets roomServiceBill to 0.0
	 */
	public RoomService() {
		this.orderList = new ArrayList<Order>();
		this.roomServiceBill = 0.0;
	}
	
	//
	/**
	 * get methods
	 * We made it such that only methods returning roomServiceBill are public
	 * this is made public as it is required to tabulate the grand total for the receipt
	 * Methods returning food items of room service order and grand total of roomServiceBill are protected
	 * this ensures better encapsulation of information while ensuring that the methods can be accessed by the
	 * same package and subclasses
	 */
	/**
	 * gets bill of this room service order
	 * @return final bill of this room service order
	 */
	public double getRoomServiceBill() {return this.roomServiceBill;} 
	/**
	 * gets the food items of this room service order
	 * @return list of food items in this room service order
	 */
	public ArrayList<Order> getArray() {return this.orderList;}
	
	/**
	 * set method
	 */
	/**
	 * sets bill of this room service order
	 * @param total final bill of this room service order
	 * @return updated total final bill of this room service order
	 */
	protected void setRoomServiceBill(double total) {this.roomServiceBill = total;}
	
	/**
	 * addOrder() method to add orders to Room Service object
	 */
	/**
	 * This method add the order from the parameter; into the Room Service object
	 * Follows the Interface Segregation principle; with instead of one big interface, 
	 * many small interfaces 
	 * based on groups of methods
	 * @param daOrder this is the new order to be added to the Room Service object
	 * @throws ArrayException occurs upon an error, calls array exception and 
	 * throws a custom exception
	 */
	public void addOrder(Order daOrder) throws ArrayException{
		RoomServiceManipulator rsm = new RoomServiceManipulator(this);
		RSBillTabulator rbt = new RSBillTabulator(this);
		rsm.addEntry(daOrder);
		rbt.calculateRoomServiceBill();
	}	
	
	/**
	 * # info method prints all orders taken
	 */
	/**
	 * info method prints all of the orders take
	 */
	public void info() {
		DisplayRoomService drs = new DisplayRoomService(this);
		drs.printArray();
	}
	
	/**
	 * # reset method resets RoomService object upon check out
	 */
	/**
	 * This reset method resets RoomService object upon check out
	 */
	public void reset() { 
		RoomServiceManipulator rsm = new RoomServiceManipulator(this);
		rsm.resetArray();
		this.roomServiceBill = 0.0;
	}	
	
	/**
	 * This method refreshes the Order Status upon calling it
	 */
	public void refreshOrderStatuses() {
		RoomServiceManipulator rsm = new RoomServiceManipulator(this);
		rsm.set();
	}
}

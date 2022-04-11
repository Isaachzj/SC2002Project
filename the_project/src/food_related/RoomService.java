package food_related;
import java.util.ArrayList;
import list_methods.ArrayException;


public class RoomService {
	/**
	 * list of food items guest in this room service order
	 */
	private ArrayList<Order> orderList;
	/**
	 * final bill/total price of this room service order
	 */
	private double roomServiceBill;
	
	/**
	 * creates a RoomService object and sets roomServiceBill to 0.0
	 */
	public RoomService() {
		this.orderList = new ArrayList<Order>();
		this.roomServiceBill = 0.0;
	}
	
	//get methods
	/**
	 * gets bill of this room service order
	 * @return final bill of this room service order
	 */
	public double getRoomServiceBill() {return this.roomServiceBill;} //public as needed to tabulate grand total for receipt
	/**
	 * 
	 * @return list of food items in this room service order
	 */
	protected ArrayList<Order> getArray() {return this.orderList;}
	
	//set method
	/**
	 * sets bill of this room service order
	 * @param total final bill of this room service order
	 * @return updated total final bill of this room service order
	 */
	protected void setRoomServiceBill(double total) {this.roomServiceBill = total;}
	
	//addOrder() method to add orders to Room Service object
	/**
	 * This method add the order (param) into the Room Service object
	 * @param daOrder this is the new order to be added to the Room Service object
	 * @throws ArrayException
	 */
	public void addOrder(Order daOrder) throws ArrayException{
		RoomServiceManipulator rsm = new RoomServiceManipulator(this);
		RSBillTabulator rbt = new RSBillTabulator(this);
		rsm.addList(daOrder);
		rbt.calculateRoomServiceBill();
	}	
	
	//info method prints all orders taken
	/**
	 * this info method prints all of the orders take
	 */
	public void info() {
		DisplayRoomService drs = new DisplayRoomService(this);
		drs.printArray();
	}
	
	//reset method resets RoomService object upon check out
	/**
	 * This reset method resets RoomService object upon check out
	 * @throws ArrayException
	 */
	public void reset() throws ArrayException { 
		RoomServiceManipulator rsm = new RoomServiceManipulator(this);
		rsm.resetList();
		this.roomServiceBill = 0.0;
	}	
}

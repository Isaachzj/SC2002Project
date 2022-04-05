package food_related;
import java.util.ArrayList;
import list_methods.ArrayException;


public class RoomService {
	private ArrayList<Order> orderList;
	private double roomServiceBill;
	
	public RoomService() {
		this.orderList = new ArrayList<Order>();
		this.roomServiceBill = 0.0;
	}
	
	//get methods
	public double getRoomServiceBill() {return this.roomServiceBill;} //public as needed to tabulate grand total for receipt
	protected ArrayList<Order> getArray() {return this.orderList;}
	
	//set method
	protected void setRoomServiceBill(double total) {this.roomServiceBill = total;}
	
	//addOrder() method to add orders to Room Service object
	public void addOrder(Order daOrder) throws ArrayException{
		RoomServiceManipulator rsm = new RoomServiceManipulator(this);
		RSBillTabulator rbt = new RSBillTabulator(this);
		rsm.addList(daOrder);
		rbt.calculateRoomServiceBill();
	}	
	
	//info method prints all orders taken
	public void info() {
		DisplayRoomService drs = new DisplayRoomService(this);
		drs.printArray();
	}
	
	//reset method resets RoomService object upon check out
	public void reset() throws ArrayException { 
		RoomServiceManipulator rsm = new RoomServiceManipulator(this);
		rsm.resetList();
		this.roomServiceBill = 0.0;
	}	
}

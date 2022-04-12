package food_related;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import days_date_time.DateTime;
import java.util.ArrayList;
import java.time.LocalDateTime;
import enumeration.*;
import list_methods.*;

public class Order {
	/**
	 * list of food items in this order
	 */ 
	private ArrayList<Food> order;
	/**
	 * quantity of each food item in this order
	 */ 
	private ArrayList<Integer> quantity;
	/**
	 * final bill of this order (private attribute)
	 */ 
	private double bill;
	/**
	 * specifications or special request for this order (private attribute)
	 */ 
	private String remarks;
	/**
	 * time of making this order by guest (private attribute)
	 */ 
	private LocalDateTime timestamp;
	
	/**
	 * private OrderStatus status;
	 */
	
	/**
	 * Instantiation of Order object from array list of food items ordered and quantity of food items ordered by guest
	 */ 
	public Order() {
		this.order= new ArrayList<Food>();
		this.quantity = new ArrayList<Integer>();
	}
	
	/**
	 * get methods
	 * All of the methods are set to protected
	 * this ensures better encapsulation of information while ensuring that the methods can be accessed by the same package and subclasses
	 */
	/**
	 * gets the food items ordered list
	 * @return list of food items ordered by guest in this order
	 */ 
	protected ArrayList<Food> getArray() {return order;}
	/**
	 * gets the food items ordered quantity
	 * @return quantity of food items ordered by guest in this order
	 */ 
	protected ArrayList<Integer> getQuantity() {return quantity;}
	/**
	 * gets food items ordered final bill
	 * @return final bill of this order
	 */
	protected double getBill() {return this.bill;}
	/**
	 * gets food items ordered time stamp
	 * @return time stamp of making this order by guest
	 */ 
	protected LocalDateTime getTimeStamp() {return this.timestamp;}
	/**
	 * gets food items ordered remarks
	 * @return specifications or special request for this order
	 */
	protected String getRemarks() {return this.remarks;}
	/**
	 * updates total final bill of this room service order
	 * @param total final bill of this room service order
	 */ 
	protected void setBill(double bill) {this.bill = bill;}	
	/**
	 * gets the time stamp of making this order by guest
	 * @param ts this is the time stamp of making this order by guest
	 */
	protected void setTimeStamp(LocalDateTime ts) {this.timestamp = ts;} //set at the end of order
	/**
	 * gets the specifications or special request for this order
	 * @param ts this is the specifications or special request for this order
	 */
	protected void setRemarks(String remarks) {this.remarks = remarks;}
	
	/**
	 * creates an OrderManipulator object and a BillTabulator object. 
	 * sets in this OrderManipulator Object: food items list ordered, remarks, date, timestamp, bill
	 * Follows the Interface Segregation principle; with instead of one big interface, many small interfaces based on groups of methods
	 * @param menu Menu object
	 */ 
	public void makeOrder(Menu menu) throws ArrayException {
		OrderManipulator om = new OrderManipulator(this);
		BillTabulator bt = new BillTabulator(this);
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		do {
			menu.info(); //prints the menu
			om.addEntry(menu.getFood()); //gets the food item from the Menu and passes it to the addList method			
			System.out.println("Would you like anything else?\n1. Yes\t2. No");
			choice = sc.nextInt(); sc.nextLine();
		}while (choice==1);
		
		/**
		 * Remarks
		 */
		System.out.println("Any additional remarks?");
		String remarks = sc.nextLine();
		this.setRemarks(remarks);
		/**
		 * Date and time stamp
		 */
		DateTime.getLocalDateTime("Order");
		this.setTimeStamp(timestamp);
		/**
		 * Calculating order bill
		 */
		bt.calculateBill();
		return;
	}
	
	/**
     * creates a DisplayOrder object and prints food items in this order
     */ 
	public void info() {
		DisplayOrder dis = new DisplayOrder(this);
		dis.printArray();
	}
}


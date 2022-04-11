package food_related;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
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
	 * final bill of this order
	 */ 
	private double bill;
	/**
	 * specifications or special request for this order
	 */ 
	private String remarks;
	/**
	 * time of making this order by guest
	 */ 
	private String timestamp;
	//private OrderStatus status;
	
	/**
	 * creates an Order object and sets food items ordered and quantity of food items ordered by guest
	 */ 
	public Order() {
		this.order= new ArrayList<Food>();
		this.quantity = new ArrayList<Integer>();
	}
	
	//get methods
	/**
	 * @return list of food items ordered by guest in this order
	 */ 
	protected ArrayList<Food> getArray() {return order;}
	/**
	 * @return quantity of food items ordered by guest in this order
	 */ 
	protected ArrayList<Integer> getQuantity() {return quantity;}
	/**
	 * @return final bill of this order
	 */
	protected double getBill() {return this.bill;}
	/**
	 * @return time of making this order by guest
	 */ 
	protected String getTimeStamp() {return this.timestamp;}
	/**
	 * @return specifications or special request for this order
	 */
	protected String getRemarks() {return this.remarks;}
	/**
	 * updates total final bill of this room service order
	 * @param total final bill of this room service order
	 */ 
	protected void setBill(double bill) {this.bill = bill;}	
	/**
	 * updates time of making this order by guest
	 * @param ts time of making this order by guest
	 */
	protected void setTimeStamp(String ts) {this.timestamp = ts;} //set at the end of order
	/**
	 * updates specifications or special request for this order
	 * @param ts specifications or special request for this order
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
			om.addEntry(menu.getFood()); //gets the food item from the Menu and passes it to the addList method			
			System.out.println("Would you like anything else?\n1. Yes\t2. No");
			choice = sc.nextInt(); sc.nextLine();
		}while (choice==1);
		
		//Remarks
		System.out.println("Any additional remarks?");
		String remarks = sc.nextLine();
		this.setRemarks(remarks);
		//Date timestamp
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		String timestamp = date.format(new Date());
		this.setTimeStamp(timestamp);
		//Calculating order bill
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


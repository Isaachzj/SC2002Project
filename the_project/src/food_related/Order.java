package food_related;

import java.util.Scanner;
import days_date_time.DateTime;
import enumeration.*;
import room.*;
import java.util.ArrayList;
import java.time.*;
import list_methods.*;

/**
 * Instantiation of Order object from array list of food items ordered and 
 * quantity of food items ordered by guest
 * 
 * Information Encapsulation;
 * Most of the methods are set to protected
 * this ensures better encapsulation of information
 * while ensuring that the methods can be accessed by the same package and subclasses
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
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
	 * completion time of order
	 */	
	private LocalDateTime timeCompleted;
	
	/**
	 * private OrderStatus status;
	 */
	private OrderStatus status;
	
	/**
	 * time needed to prepare order
	 */
	private int timeToPrep;
	

	
	/**
	 * Instantiation of Order object from array list of food items ordered and 
	 * quantity of food items ordered by guest
	 */ 
	public Order() {
		this.order= new ArrayList<Food>();
		this.quantity = new ArrayList<Integer>();
	}
	
	/**
	 * get methods
	 * Most of the methods are set to protected
	 * this ensures better encapsulation of information
	 * while ensuring that the methods can be accessed by the same package and subclasses
	 */
	
	/**
	 * This gets the preparation status of the order
	 * @return status of order
	 */
	public OrderStatus getOrderStatus() {return this.status;}
	
	/**
	 * Returns the date time of completion
	 * @return the date and time when the order is completed
	 */
	
	protected LocalDateTime getTimeCompleted() {return this.timeCompleted;}
	
	/**
	 * This gets the time needed to prepare the order
	 * @return is the time taken to prepare the order
	 */
	protected int getTimeToPrep() {return this.timeToPrep;}
	
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
	 * sets the time needed to prepare order
	 * @param minutes is the inputed time
	 */
	protected void setTimeToPrep(int minutes) {this.timeToPrep = minutes;}
	
	/**
	 * sets the date and time when order would be completed
	 * @param dateTime is the inputed date time object
	 */
	protected void setTimeCompleted(LocalDateTime dateTime) {this.timeCompleted = dateTime;}	
	
	/**
	 * gets the specifications or special request for this order
	 * @param ts this is the specifications or special request for this order
	 */
	protected void setRemarks(String remarks) {this.remarks = remarks;}
	
	/**
	 * This sets the preparation status of the order to the inputted one.
	 * This is used to refresh order status periodically as time progresses
	 * @param prepStatus is the new status of order object
	 */
	protected void setPreparationStauts (OrderStatus prepStatus) {this.status = prepStatus;}
	
	/**
	 * creates an OrderManipulator object and a BillTabulator object. 
	 * sets in this OrderManipulator Object: food items list ordered, remarks, date, timestamp, bill
	 * Follows the Interface Segregation principle; with instead of one big interface,
	 * many small interfaces based on groups of methods
	 * @param room This is the room object
	 * @throws ArrayException occurs upon an error, calls array exception and throws a custom exception
	 */ 
	public void makeOrder(Room room) throws ArrayException {
		Menu menu = room.getMenu();
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
		 * ensures that date and time when ordering food is between check in DateTime and check out DateTime
		 */
		
		LocalDateTime currentTime = LocalDateTime.now();
		//LocalDateTime currentTime = DateTime.getLocalDateTime("Order");	
		/*while (true) {
			if (currentTime.isAfter(room.getReservation().getCheckOutDateTime())) {
				System.out.println("Are you sure? It is after the check out date and time. Enter again");
				currentTime = DateTime.getLocalDateTime("Order");
				continue;
			}
			if (currentTime.isBefore(room.getReservation().getCheckInDateTime())) {
				System.out.println("Are you sure? It is before the check in date and time. Enter again");
				currentTime = DateTime.getLocalDateTime("Order");
				continue;
			}
			break;
		}*/
		
		/**
		 * Sets the time the order was placed
		 */
		this.setTimeStamp(currentTime);
		
		/**
		 * Creating LocalDateTime object based on order preparation time and time order was placed and assigning it to timeCompleted attribute
		 */		
		this.timeCompleted = LocalDateTime.now().plusMinutes(this.timeToPrep);
		
		/**
		 * Setting OrderStatus 
		 */
		this.status = OrderStatus.PREPARING;
		
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


package food_related;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import enumeration.*;
import list_methods.*;

public class Order {
	private ArrayList<Food> order;
	private ArrayList<Integer> quantity;
	private double bill;
	private String remarks;
	private String timestamp;
	//private OrderStatus status;
	
	
	public Order() {
		this.order= new ArrayList<Food>();
		this.quantity = new ArrayList<Integer>();
	}
	
	//get methods
	protected ArrayList<Food> getArray() {return order;}
	protected ArrayList<Integer> getQuantity() {return quantity;}
	protected double getBill() {return this.bill;}
	protected String getTimeStamp() {return this.timestamp;}
	protected String getRemarks() {return this.remarks;}
	
	protected void setBill(double bill) {this.bill = bill;}	
	protected void setTimeStamp(String ts) {this.timestamp = ts;} //set at the end of order
	protected void setRemarks(String remarks) {this.remarks = remarks;}
	
	public void makeOrder(Menu menu) throws ArrayException {
		OrderManipulator om = new OrderManipulator(this);
		BillTabulator bt = new BillTabulator(this);
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		do {
			om.addList(menu.getFood()); //gets the food item from the Menu and passes it to the addList method			
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
	
	public void info() {
		DisplayOrder dis = new DisplayOrder(this);
		dis.printArray();
	}
}


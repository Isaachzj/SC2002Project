package testing;

import food_related.*;
import list_methods.ArrayException;
import room.*;


public class TestOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order od = new Order();
		/*Menu menu = new Menu();
		MenuManipulator mm = new MenuManipulator(menu);
		OrderManipulator om = new OrderManipulator(order, menu);
		DisplayOrder dis = new DisplayOrder(order);
		DisplayMenu dism = new DisplayMenu(menu);
		BillTabulator bt = new BillTabulator(order);*/
		
		try{
		SingleRoom ss = new SingleRoom(2,1);
		Menu menu = ss.getMenuList();
		menu.info();
		od.makeOrder(menu);
		od.info();		
	/*	

		
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		String timestamp = date.format(new Date());
		od.setTimeStamp(timestamp);
		od.setRemarks("NILL");
		
		od.printOrder();
		*/
		}
		catch(ArrayException e) {System.out.println(e.getMessage());}
		//catch(Exception ee) {System.out.println("Enter a value!");}
		
	}

}

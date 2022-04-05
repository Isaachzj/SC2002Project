package testing;

import Room.DoubleRoom;
import food_related.*;
import list_methods.*;


public class TestMenu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("NEW RUN");
			DoubleRoom ss = new DoubleRoom(1, 1);
			Menu menu = ss.getMenuList();
			
			/*MenuManipulator mm = new MenuManipulator(menu);
			DisplayMenu dis = new DisplayMenu(menu);			
			/*AddFood add = new AddFood(menu);

			RemoveFood re = new RemoveFood(menu);
			UpdateFood up = new UpdateFood(menu);*/
			try{
			/*mm.addList();
			mm.addList();
			mm.addList();
			dis.printArray();
			
			mm.removeList();
			dis.printArray();
			
			mm.set();
			dis.printArray();*/
				

			//menu.addFood();
			menu.info();
			menu.removeFood();
			menu.info();
			menu.removeFood();
			menu.info();
			}
			catch(ArrayException e) {System.out.println(e.getMessage());continue;}
			catch(Exception ee) {System.out.println("Enter a value!");continue;}
			
		}
	}
}

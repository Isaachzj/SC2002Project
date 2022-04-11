package food_related;
import list_methods.Print;

public class DisplayRoomService implements Print {
	private RoomService rs;
	/**
	 * Displays the Room service of the guests
	 * The DisplayRoomService class follows the Single Responsibility principle, as has a sole responsibility of displaying the Room Service 
	 * Additionally; it follows the Open-Closed principle as changes in the Display does not require a change in source code of modules
	 * It also follows the Dependency Injection principle as there are also class for DisplayOrder and DisplayMenu
	 * @param    rs this is the Room service of the guests
	*/
	public DisplayRoomService(RoomService rs) {
		this.rs = rs;
	}
	/**
	 * Prints out the details of orders and the total bill for room service
	 * The number of orders taken would be printed out if the order size if non-zero. Else, it would indicate that no orders were taken.
	 * Will also display the total bill for the room service
	 * Overrides the printArray() method in Print
	*/
	public void printArray() {
		//System.out.println("=============== Order ===============");
		if (rs.getArray().size()==0) {
			System.out.println("--No orders taken!--");
			return;
		}
		
		System.out.println("=============== ROOM SERVICE ===============");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		for (int i=0; i<rs.getArray().size(); i++) {
			System.out.printf("=============== Order %d ===============\n", i);
			Order curOrder = rs.getArray().get(i);
			curOrder.info();
		}
		
		System.out.printf("Total Bill for Room Service: $%.2f\n", rs.getRoomServiceBill());
		return;
	}
}

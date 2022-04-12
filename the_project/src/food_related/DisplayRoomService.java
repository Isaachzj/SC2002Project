package food_related;
import list_methods.Print;

public class DisplayRoomService implements Print {
	private RoomService rs;
	/**
	 * # Displays Room service details from RoomService object
	 * The DisplayRoomService class follows the Single Responsibility principle, as has a sole responsibility of displaying the Room Service 
	 * Additionally; it follows the Open-Closed principle as changes in the Display does not require a change in source code of modules
	 * @param    rs this is the Room service of the guests
	*/
	public DisplayRoomService(RoomService rs) {
		this.rs = rs;
	}
	/**
	 * Overrides the printArray() method in Print
	 * Prints out the details of orders and the total bill for room service
	 * will also display the total bill for the room service
	 * If no roomservice taken, i.e. roomservice array is empty - prints error message.
	 * Else, if roomservice taken, prints out the details and total bill
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
			System.out.printf("=============== Order %d ===============\n", i+1);
			Order curOrder = rs.getArray().get(i);
			curOrder.info();
		}
		
		System.out.printf("Total Bill for Room Service: $%.2f\n", rs.getRoomServiceBill());
		return;
	}
}

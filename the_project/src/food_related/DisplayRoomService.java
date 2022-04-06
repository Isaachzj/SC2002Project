package food_related;
import list_methods.Print;

public class DisplayRoomService implements Print {
	private RoomService rs;
	
	public DisplayRoomService(RoomService rs) {
		this.rs = rs;
	}
	
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

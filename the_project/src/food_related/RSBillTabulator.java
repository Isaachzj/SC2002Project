package food_related;

public class RSBillTabulator {
	private RoomService rs;
	
	public RSBillTabulator(RoomService rs) {
		this.rs = rs;
	}
	
	public void calculateRoomServiceBill() {
		double totalBill=0.0;
		
		for (int i=0; i<rs.getArray().size(); i++) {
			Order curOrder = rs.getArray().get(i);
			totalBill += curOrder.getBill();
		}
		
		//set the total bill of room service
		rs.setRoomServiceBill(totalBill);
	}
}

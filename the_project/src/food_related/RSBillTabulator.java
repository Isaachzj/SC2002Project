package food_related;

public class RSBillTabulator {
	private RoomService rs;
	
	/**
	 * creates a RSBillTabulator object and
	 * adds this room service order into this RSBillTabulator 
	 * @param rs RSBillTabulator object
	 */
	public RSBillTabulator(RoomService rs) {
		this.rs = rs;
	}
	
	/**
	 * sums up all food item prices into totalBill 
	 * and sets totalBill as RoomServiceBill in this room service order
	 */
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

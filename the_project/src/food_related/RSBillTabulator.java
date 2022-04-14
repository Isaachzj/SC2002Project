package food_related;

public class RSBillTabulator {
	private RoomService rs;
	
	/**
	 * Adds RoomService bills to calculate the total bill tabulated
	 * Follows the Single Responsibility principle due to sole responsibility
	 * It also follows the Open-Closed principle due to its software entities open for extension but closed 
	 * for modifications
	 * @param rs RSBillTabulator object;
	 * the RoomService object includes the list of food items ordered and its price, which is required for 
	 * this method to calculate the total bill of the RoomService
	 */
	public RSBillTabulator(RoomService rs) {
		this.rs = rs;
	}	
	
	/**
	 * this adds up all food item prices into totalBill and sets totalBill as RoomServiceBill in this room 
	 * service order
	 */
	public void calculateRoomServiceBill() {
		double totalBill=0.0;
		
		for (int i=0; i<rs.getArray().size(); i++) {
			Order curOrder = rs.getArray().get(i);
			totalBill += curOrder.getBill();
		}
		
		/**
		 * set the total bill of room service
		 */
		rs.setRoomServiceBill(totalBill);
	}
}

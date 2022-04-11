package food_related;

public class BillTabulator {
	private Order order;
	/**
	 * Returns the Guest's order bill
	 * @return this is the order bill of the Guest
	*/
	public BillTabulator(Order order) {
		this.order = order;
	}
	/**
	 * Calculates the total bill of guest by tabulating the prices of food ordered by the respective guest
	*/
	public void calculateBill() {
		for (int i=0; i<order.getArray().size(); i++) {
			
			Food food = order.getArray().get(i);
			int num = order.getQuantity().get(i);
			
			double price = food.getPrice();
			
			order.setBill(order.getBill()+ price*num);	
		}
		return;
	}
}

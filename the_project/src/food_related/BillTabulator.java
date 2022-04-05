package food_related;

public class BillTabulator {
	private Order order;
	
	public BillTabulator(Order order) {
		this.order = order;
	}
	
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

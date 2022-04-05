package food_related;
import list_methods.*;

public class DisplayOrder implements Print {
	private Order order;
	
	public DisplayOrder(Order order) {
		this.order = order;
	}
	
	public void printArray() {
		
		if (order.getArray().size()==0) 
			System.out.println("--No orders taken!--");
		
		for (int i=1; i<=order.getArray().size(); i++) {
			Food food = order.getArray().get(i-1);
			System.out.printf("%-12d%-10s%10.2f%10d\n", i, food.getFoodName(), food.getPrice(), order.getQuantity().get(i-1));
		}
		System.out.printf("Remarks: %s\n", order.getRemarks());
		System.out.printf("Total Bill: %.2f\n", order.getBill());
		System.out.println("Date and Time: " + order.getTimeStamp());
		return;
	}
}

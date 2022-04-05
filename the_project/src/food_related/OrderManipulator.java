package food_related;
import java.util.Scanner;
import list_methods.*;

public class OrderManipulator implements AddGivenObject{
	private Order order;

	
	public OrderManipulator(Order order) {
		this.order = order;
	}
	
	// Adds the ordered food into the order food list
	public void addList(Object daFood) throws ArrayException{
		boolean found = false;
		int index=0;
		Food food;
		
		//For this case, we will actually ensure that only a food object is passed to this function so this is actually uneeded but we kiasu :)
		if (daFood==null) {throw new ArrayException("Error!!");}
		else if (!(daFood instanceof Food)) { throw new ArrayException("Error!!");}
		else {food = (Food) daFood;} 
		
		Scanner sc = new Scanner (System.in);	

		System.out.println("Enter quantity:");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		//Ensure quantity is greater than 0
		while (quantity<=0) {
			System.out.println("Enter valid quantity");
			quantity = sc.nextInt(); sc.nextLine();
		}
		
		//Check if such an entry exists!
		for (int i=0; i<order.getArray().size(); i++) {
			Food disfood = order.getArray().get(i);
			if (disfood.getFoodName().compareTo(food.getFoodName()) == 0) {
				found = true; index = i;	
				break;
			}//end if
		}//end for
		
		//Update quantity if food added before
		if (found) {
			order.getQuantity().set(index, order.getQuantity().get(index) + quantity);
			System.out.println("Order Added successfully!");
		}
		//Add new food entry and quantity if not ordered before
		else {
			order.getArray().add(food);
			order.getQuantity().add(quantity);
			System.out.println("Order Added successfully!");
		}
		
	}
}

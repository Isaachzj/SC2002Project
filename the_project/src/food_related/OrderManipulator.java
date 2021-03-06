package food_related;
import java.util.Scanner;
import list_methods.*;

/**
 * Adds the ordered food into the order food list
 * Exception would be thrown if ordered food is either null or not an instance of 
 * Food class, with an Error
 * displayed to inform user that the object passed to this function is not a food object
 * Else, object passed to function is a food object, quantity of food to be included. 
 * System also ensures that quantity of food entered is a positive number
 * This Constructor follows the Single Responsibility principle
 * Additionally, it follows the Open-Closed principle as its software entities 
 * is open for extension but closed for modifications
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class OrderManipulator implements AddGivenObject{
	
	/**
	 * This is the order object to be manipulated
	 */
	private Order order;
	
	/**
	 * # Constructor
	 */
	/**
     * This Constructor follows the Single Responsibility principle
	 * Additionally, it follows the Open-Closed principle as its software entities 
	 * is open for extension but closed for modifications
     * @param order assigns order to OrderManipulator so that OrderManipulator knows which order to manipulate
	*/
	public OrderManipulator(Order order) {
		this.order = order;
	}
	
	/**
	 * Adds the ordered food into the order food list
	 * Exception would be thrown if ordered food is either null or not an instance of Food class, with an Error
	 * displayed to inform user that the object passed to this function is not a food object
	 * Else, object passed to function is a food object, quantity of food to be included. System also ensures 
	 * that quantity of food entered is a positive number
	 * 
	 * @param   daFood this is the food ordered by the guest
	*/
	public void addEntry(Object daFood) throws ArrayException{
		boolean found = false;
		int index=0;
		Food food;
		
		/**
		 * For this case, we will actually ensure that only a food object is passed to this function so this is
		 * actually not needed but we kiasu :)
		 */
		if (daFood==null) {throw new ArrayException("Error!!");}
		else if (!(daFood instanceof Food)) { throw new ArrayException("Error!!");}
		else {food = (Food) daFood;} 
		
		Scanner sc = new Scanner (System.in);	

		System.out.println("Enter quantity:");
		int quantity = sc.nextInt(); sc.nextLine();
		
		/**
		 * Ensure quantity is greater than 0
		 */
		while (quantity<=0) {
			System.out.println("Enter valid quantity");
			quantity = sc.nextInt(); sc.nextLine();
		}
		
		/**
		 * Check if such an entry exists!
		 */
		for (int i=0; i<order.getArray().size(); i++) {
			Food disfood = order.getArray().get(i);
			if (disfood.getFoodName().compareTo(food.getFoodName()) == 0) {
				found = true; index = i;	
				break;
			}//end if
		}//end for
		
		/**
		 * Update quantity if food added before
		 */
		if (found) {
			order.getQuantity().set(index, order.getQuantity().get(index) + quantity);
			System.out.println("Order Added successfully!");
		}
		
		/**
		 * Add new food entry and quantity if not ordered before
		 */
		else {
			order.getArray().add(new Food(food)); //@ wen lu can you see this?
			order.getQuantity().add(quantity);
			System.out.println("Order Added successfully!");
		}
		
		/**
		 * Adds the preparation time for each food to overall order completion time
		 */
		order.setTimeToPrep(order.getTimeToPrep() + food.getPrepDuration()*quantity);
	}

}

package food_related;

/**
 * Follows Single Responsibility principle as it has the single responsibility of
 * returning Guest's order bill. 
 * Also follows the Open-Close principle since software entity in this case open
 * for extension but closed for modifications. 
 * 
 * The BillTabulator calculates the total bill of guest by tabulating the prices of food ordered by the respective guest
 * calls addEntry method which allows object to be added given no exception thrown
 * (i.e. given no errors)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public class BillTabulator {
	/**
	 * order object is set to private to ensure better encapsulation
	 */
	private Order order;
	/**
	 * # Guest's order bill
	 */
	/**
	 * Follows Single Responsibility principle as it has the single responsibility of
	 * returning Guest's order bill
	 * Also follows the Open-Close principle since software entity in this case open
	 * for extension but closed for modifications
	 * @param order this is the order bill of the Guest
	 */
	public BillTabulator(Order order) {
		this.order = order;
	}
	/**
	 * Calculates the total bill of guest by tabulating the prices of food ordered by the respective guest
	 * Similarly, also follows the Single Responsibility principle with sole responsibility of calculating the
	 * Bill
	 * Also follows the Open-Close principle since software entity in this case open for extension but closed 
	 * for modifications
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

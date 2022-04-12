package enumeration;
/**
 * enumerations for order status of a Room object;
 * For the enumeration of the OrderStatus, there are 3 types (CONFIRMED, PREPARING, DELIVERED);
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 *
 */
public enum OrderStatus {
	/**
	 * CONFIRMED is used to indicate when the order for the Food object has been received;
	 */
	CONFIRMED, 
	/**
	 * PREPARING is used to indicate when the order for the Food object is under preparation or admist delivery;
	 */
	PREPARING, 
	/**
	 * DELIVERED is used to indicate when the food has been delivered to the guest;
	 */
	DELIVERED
}

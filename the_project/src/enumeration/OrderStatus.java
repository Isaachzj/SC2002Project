package enumeration;
/**
 * Created enumeration for the order status. 
 * For the enumeration of the OrderStatus, there are 2 types (CONFIRMED, PREPARING);
 * 
 * PREPARING is used to indicate when the order for the Food object. 
 * CONFIRMED is used to indicate when the order for the Food object has been received.
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public enum OrderStatus {
	/**
	 * enumerations for order status of a Room object;
	 * 
	
	/**
	 * PREPARING is used to indicate when the order for the Food object
	 * is under preparation or admist delivery;
	 */
	PREPARING, 
	
	/**
	 * CONFIRMED is used to indicate when the order for the Food object has been received;
	 */
	COMPLETED
}

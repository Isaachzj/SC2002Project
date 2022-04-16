package list_methods;
/**
 * Follows the Interface Segregation Principle
 * This is part of the smaller interface; from the Add interface
 * 
 * Exception handling for entry removal
 * i.e. when no entry is found upon removal of entry; exception 
 * (ArrayException) would be thrown
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public interface RemoveStandard {
	/**
	 *  #remove method
	 */
	/**
	 * Exception handling for entry removal
	 * i.e. when no entry is found upon removal of entry; exception (ArrayException) would be thrown
	 * @throws ArrayException occurs when no entry found for its request to be removed
	 */
	public void removeEntry() throws ArrayException;
}

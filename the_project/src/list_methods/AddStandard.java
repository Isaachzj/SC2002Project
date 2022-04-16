package list_methods;
/**
 * Follows the Interface Segregation Principle
 * This is part of the smaller interface; from the Add interface
 * 
 * Exception handling for duplicate entry
 * i.e. when a duplicate entry is found upon adding of entry; exception
 * (ArrayException) would be thrown
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public interface AddStandard {
	/**
	 * Exception handling for duplicate entry
	 * i.e. when a duplicate entry is found upon adding of entry; exception
	 * (ArrayException) would be thrown
	 * @throws ArrayException occurs upon a duplicate entry
	 */
	public void addEntry() throws ArrayException;	//exception for duplicate entry
}

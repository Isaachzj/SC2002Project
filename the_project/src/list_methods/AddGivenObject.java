package list_methods;
/**
 * Follows the Interface Segregation Principle
 * This is part of the smaller interface; from the Add interface
 * 
 * calls addEntry method which allows object to be added given no exception thrown
 * (i.e. given no errors)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public interface AddGivenObject {
	/**
	 * calls addEntry method which allows object to be added given no exception thrown
	 * (i.e. given no errors)
	 * @param object this is the object to be added into the Entry
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void addEntry(Object object) throws ArrayException;
}

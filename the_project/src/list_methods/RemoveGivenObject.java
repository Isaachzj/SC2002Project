package list_methods;
/**
 * Follows the Interface Segregation Principle
 * This is part of the smaller interface; from the Add interface
 * 
 * calls removeEntry method which allows object to be removed given no exception thrown
 * (i.e. given no errors)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public interface RemoveGivenObject {
	/**
	 * calls removeEntry method which allows object to be removed
	 * given no exception thrown (i.e. given no errors)
	 * @param object this is the object to be removed from the Entry
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void removeEntry(Object object) throws ArrayException;
}

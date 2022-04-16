package list_methods;
/**
 * This interface allows an object to be retrieved 
 * from an entry using the getEntry method
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public interface Get {
	//get method
	/**
	 * get method
	 * to retrieve an object from entry
	 * @return this is the Exception handling message
	 * @throws ArrayException occurs upon an error upon get method from entry
	 */
	public Object getEntry() throws ArrayException;
}

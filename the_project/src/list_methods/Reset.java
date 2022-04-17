package list_methods;
/**
 * This is the interface which calls resetArray() method which resets the array
 * (with exception would be thrown for any error message encountered)
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public interface Reset {
	/**
	 * calls resetArray() method which resets the array
	 * (with exception would be thrown for any error message encountered)
	 * @throws ArrayException occurs when there are any errors upon the reset of the array
	 */
	public void resetArray() throws ArrayException;
}	

package room_features;

/**
 * Follows the Single Responsibility Principle as it has the 
 * sole responsibility of representing a feature of a room;
 */
public class Feature {
	/**
	 * name of this feature;
	 */
	private String name;
	/**
	 * status/quantity of this feature;
	 */
	private String status;
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiates name and status of this feature;
	 * @param name name of this feature;
	 * @param status status/quantity of this feature;
	 */
	public Feature(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	//get methods
	/**
	 * gets name of this feature;
	 * @return name of this feature;
	 */
	protected String getName() {return this.name;}
	/**
	 * gets status/quantity of this feature;
	 * @return status/quantity of this feature;
	 */
	protected String getStatus() {return this.status;}
	
	//set methods
	/**
	 * updates status/quantity of this feature;
	 * @param status current status/quantity of this feature;
	 */
	protected void setStatus(String status) {this.status=status;}
}

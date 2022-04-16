package guest;
import enumeration.TypeOfID;

/**
 * Instantiates the guest identity from the id number and id type. 
 * Includes Method Encapsulation
 * All methods here are set to protected for better encapsulation.
 * Methods returning guest's id type and id number is protected
 * this ensures better encapsulation of information while ensuring
 * that the methods can be accessed by the same package and subclasses
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class Identity {
	/**
	 * this is the guest's id number (private attribute)
	 */
	private String idNumber;
	/**
	 * this is the type of id indicated for the guest
	 * (enumeration; driver's liscence, NRIC, passport number)
	 */
	private TypeOfID idType;
	
	//Constructor
	/**
	 * Instantiates the guest identity from the id number and id type
	 * @param idNumber this is the guest's id number
	 * @param idType this is the guest's id type
	 */
	public Identity(String idNumber, TypeOfID idType) {
		this.idNumber = idNumber;
		this.idType = idType;
	}
	
	/**
	 * get methods
	 * All methods here are set to protected for better encapsulation.
	 * Methods returning guest's id type and id number is protected
	 * this ensures better encapsulation of information while ensuring
	 * that the methods can be accessed by the same package and subclasses
	 */
	/**
	 * gets the id type of the guest
	 * @return this is the guest's id type
	 */
	protected TypeOfID getIdType() {return this.idType;}
	/**
	 * gets the id number of the guest
	 * @return this is the guest's id number
	 */
	protected String getIdNumber() {return this.idNumber;}
	
}

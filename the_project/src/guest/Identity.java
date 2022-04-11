package guest;
import enumeration.TypeOfID;

public class Identity {
	/**
	 * this is the guest's id number
	 */
	private String idNumber;
	/**
	 * this is the type of id indicated for the guest (enumeration; driver's liscence, NRIC, passport number
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
	
	//get methods
	/**
	 * Gets the id type of the guest
	 * @return this is the guest's id type
	 */
	protected TypeOfID getIdType() {return this.idType;}
	/**
	 * Gets the id number of the guest
	 * @return this is the guest's id number
	 */
	protected String getIdNumber() {return this.idNumber;}
	
}

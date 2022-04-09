package guest;
import enumeration.TypeOfID;

public class Identity {
	private String idNumber;
	private TypeOfID idType;
	
	//Constructor
	public Identity(String idNumber, TypeOfID idType) {
		this.idNumber = idNumber;
		this.idType = idType;
	}
	
	//get methods
	protected TypeOfID getIdType() {return this.idType;}
	protected String getIdNumber() {return this.idNumber;}
	
	//set methods
	protected void setIdType(TypeOfID idType) {this.idType = idType;}
	protected void setIdNumber(String id) {this.idNumber = id;}
}

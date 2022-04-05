package guest;
import enumeration.TypeOfID;

public class Identity {
	private String identity;
	private TypeOfID identityType;
	
	//Constructor
	public Identity(String identity) {
		this.identityType = TypeOfID.PASSPORT;
	}
	public Identity(String identity, TypeOfID identityType) {
		this.identity = identity;
		this.identityType = identityType;
	}
	
	//get methods
	protected TypeOfID getidentityType() {return this.identityType;}
	protected String getidentity() {return this.identity;}
	
	//set methods
	protected void setidentityType(TypeOfID idtype) {this.identityType = idtype;}
	protected void setidentity(String id) {this.identity = id;}
}

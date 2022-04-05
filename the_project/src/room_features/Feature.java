package room_features;

public class Feature {
	private String name;
	private String status;
	//private double price;
	
	/*
	public Feature(String name) {
		this.name = name;
		this.status = "NA";
	}*/
	
	public Feature(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	//get methods
	protected String getName() {return this.name;}
	protected String getStatus() {return this.status;}
	
	//set methods
	protected void setStatus(String status) {this.status=status;}
}

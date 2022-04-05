package room_rate;

public class RoomRate {
	private double weekday;
	private double weekend;
	private double discount;
	
	//Constructor
	/*
	public RoomRate() {
		this.weekday = 0;
		this.weekend = 0;
		this.discount = 0;
	}*/
	
	public RoomRate(double weekday, double weekend, double discount) {
		this.weekday = weekday;
		this.weekend = weekend;
		this.discount = discount;
	}
	
	//get methods
	protected double getWeekday() {return weekday;}
	protected double getWeekend() {return weekend;}
	protected double getDiscount() {return discount;}
	
	//set methods
	public void setWeekday(double num) {this.weekday = num;}
	public void setWeekend(double num) {this.weekend = num;}
	public void setDiscount(double num) {this.discount = num;}
	
	//prints Room Rate info
	public void info() {
		DisplayRates dr = new DisplayRates(this);
		dr.printRates();
	}
}

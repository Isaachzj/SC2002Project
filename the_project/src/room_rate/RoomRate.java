package room_rate;

public class RoomRate {
	
	/**
	 * this is the weekday price per day for this room (private attribute);
	 */
	private double weekday;
	/**
	 * this is the weekend price per day for this room (private attribute);
	 */
	private double weekend;
	
	/**
	 * #Constructor
	 */
	/**
	 * initiates weekday price and weekend price for this room using passed in arguments;
	 * @param weekday weekday price per day for this room;
	 * @param weekend weekend price per day for this room;
	 */
	public RoomRate(double weekday, double weekend) {
		this.weekday = weekday;
		this.weekend = weekend;
	}
	
	/**
	 * # get methods
	 */
	/**
	 * gets weekday price per day for this room;
	 * @return weekday price per day for this room
	 */
	protected double getWeekday() {return weekday;}
	/**
	 * gets weekend price per day for this room;
	 * @return weekend price per day for this room
	 */
	protected double getWeekend() {return weekend;}
	
	/*
	 * Set methods (NOT USED)
	 * protected void setWeekday(double num) {this.weekday = num;}
	 * protected void setWeekend(double num) {this.weekend = num;}
	 */
	
	
	/**
	 * # prints Room Rate info
	 */
	/**
	 * creates a DisplayRates object and prints room rate details;
	 */
	public void info() {
		DisplayRates dr = new DisplayRates(this);
		dr.printRates();
	}
}

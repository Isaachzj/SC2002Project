package room_rate;

/**
 * Follows the Single Responsibility Principle as it sole responsibility is to print room rate details;
 */

public class DisplayRates {
	/**
	 * Stores the RoomRate object to know which RoomRate to display
	 */
	private RoomRate rr;
	
	/**
	 * #Constructor
	 */
	/**
	 * sets this RoomRate to passed in RoomRate object;
	 * @param rr RoomRate object
	 */
	public DisplayRates(RoomRate rr) {
		this.rr = rr;
	}
	
	/**
	 * prints room rates for a weekday and a weekend day in a tidy template;
	 */
	protected void printRates() {
		System.out.println("===========================Room Rates===========================");
		System.out.printf("Weekday: $%.2f/day\n", rr.getWeekday());
		System.out.printf("Weekend: $%.2f/day\n", rr.getWeekend());
	}
}

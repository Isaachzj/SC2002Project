package hotel;

/**
 * This is the interface used to print the Room Status report and Occupancy report
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class TestHotel {
	/**
	 * This is used to print the Room Status report and Occupancy report
	 * @param args this is the argument required to print the reports
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
		RoomStatusReport rs = new RoomStatusReport(hotel);
		rs.printStatusReport();
		System.out.println("\n\n");
		rs.printOccupancyReport();
	}

}

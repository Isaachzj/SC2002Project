package days_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * This is allows the calculation of the number of weekdays and weekends
 * stayed over by the guest, using the methods calcWeekDays and calcWeekEnds.
 * 
 * The number of the days for the guest should be calculated separately as
 * they have their respective rates (i.e. bill incurred for weekend higher
 * than that of weekday).
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class LengthOfStay {
	/**
	 * Calculates number of weekdays guest stayed in the room. 
	 * This information can be used to calculate the bill incurred by the guest
	 * upon the stay at the hotel
	 * @param start first day of guest stay, check-in date;
	 * @param end last day of guest stay, check-out date;
	 * @return number of weekdays guest stayed in the room for;
	 */
	public static long calcWeekDays(LocalDate start, LocalDate end) {
	    DayOfWeek startW = start.getDayOfWeek();
	    DayOfWeek endW = end.getDayOfWeek();
	
	    long days = ChronoUnit.DAYS.between(start, end);
	    
	    /**
	     * # number of days - ((2*number of weeks) equivalent to number of weekends)
	     */
	    long daysWithoutWeekends = days - 2 * ((days + startW.getValue())/7);
	
	    /**
	     * # adjust for starting and ending on a Sunday:
	     */
	    daysWithoutWeekends = daysWithoutWeekends + (startW == DayOfWeek.SUNDAY ? 1 : 0) + (endW == DayOfWeek.SUNDAY ? 1 : 0);
	    
	    /**
	     * # adjust for ending on weekdays since
	     * above does not include end date into calculating number of weekdays
	     */
	    daysWithoutWeekends = daysWithoutWeekends + (endW.getValue() <= 5 ? 1:0);
	    return daysWithoutWeekends;
	}
	
	/**
	 * Calculates number of weekends guest stayed in the room. 
	 * This information can be used to calculate the bill incurred by the guest
	 * upon the stay at the hotel
	 * @param start first day of guest stay, check-in date;
	 * @param end last day of guest stay, check-out date;
	 * @return number of weekends guest stayed in the room for;
	 */
	public static long calcWeekEnds(LocalDate start, LocalDate end) {
	    DayOfWeek startW = start.getDayOfWeek();
	    DayOfWeek endW = end.getDayOfWeek();
	
	    long days = ChronoUnit.DAYS.between(start, end);
	    
	    long weekends = 2 * ((days + startW.getValue())/7);
	    
	    /**
	     * # Adjust for starting and ending on a Sunday:
	     */
	    weekends = weekends - (startW == DayOfWeek.SUNDAY ? 1 : 0) - (endW == DayOfWeek.SUNDAY ? 1 : 0);
	    
	    /**
	     * # adjust for ending on weekends since above
	     * does not include end date into calculating number of weekends
	     */
	    weekends = weekends + (endW.getValue() > 5 ? 1:0);
	    return weekends;
	}
}

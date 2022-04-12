package days_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LengthOfStay {
	public static long calcWeekDays(LocalDate start, LocalDate end) {
	    DayOfWeek startW = start.getDayOfWeek();
	    DayOfWeek endW = end.getDayOfWeek();
	
	    long days = ChronoUnit.DAYS.between(start, end);
	    
	    // number of days - ((2*number of weeks) equivalent to number of weekends)
	    long daysWithoutWeekends = days - 2 * ((days + startW.getValue())/7);
	
	    //adjust for starting and ending on a Sunday:
	    daysWithoutWeekends = daysWithoutWeekends + (startW == DayOfWeek.SUNDAY ? 1 : 0) + (endW == DayOfWeek.SUNDAY ? 1 : 0);
	    
	    //adjust for ending on weekdays since above does not include end date into calculating number of weekdays
	    daysWithoutWeekends = daysWithoutWeekends + (endW.getValue() <= 5 ? 1:0);
	    return daysWithoutWeekends;
	}
	
	public static long calcWeekEnds(LocalDate start, LocalDate end) {
	    DayOfWeek startW = start.getDayOfWeek();
	    DayOfWeek endW = end.getDayOfWeek();
	
	    long days = ChronoUnit.DAYS.between(start, end);
	    
	    long weekends = 2 * ((days + startW.getValue())/7);
	    
	    //adjust for starting and ending on a Sunday:
	    weekends = weekends - (startW == DayOfWeek.SUNDAY ? 1 : 0) - (endW == DayOfWeek.SUNDAY ? 1 : 0);
	    
	    //adjust for ending on weekends since above does not include end date into calculating number of weekends
	    weekends = weekends + (endW.getValue() > 5 ? 1:0);
	    return weekends;
	}
}

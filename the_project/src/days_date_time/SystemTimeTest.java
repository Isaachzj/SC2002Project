package days_date_time;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class SystemTimeTest {
	public static void main (String[] args ) {
		try {
			String dateToSet = "04-15-22";
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy");  
			 String setDate = "cmd /C date "+sdf.format(dateToSet);  
			 Process dateProc = Runtime.getRuntime().exec(setDate);  
			 dateProc.waitFor();//Might take a couple of seconds
		}
		catch(IOException ex) {System.out.println (ex.toString());}
	}
}

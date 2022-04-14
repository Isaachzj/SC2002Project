package serialize_deserialize;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class GuestText {
	
	  // an example of saving
	public static void saveReservations(String filename, List al) throws IOException {
			List alw = new ArrayList() ;// to store Professors data

	        for (int i = 0 ; i < al.size() ; i++) {
					Professor prof = (Professor)al.get(i);
					StringBuilder st =  new StringBuilder() ;
					st.append(prof.getName().trim());
					st.append(SEPARATOR);
					st.append(prof.getEmail().trim());
					st.append(SEPARATOR);
					st.append(prof.getContact());
					alw.add(st.toString()) ;
				}
				write(filename,alw);
		}

	  /** Write fixed content to the given file. */
	  public static void write(String fileName, List data) throws IOException  {
	    PrintWriter out = new PrintWriter(new FileWriter(fileName));

	    try {
			for (int i =0; i < data.size() ; i++) {
	      		out.println((String)data.get(i));
			}
	    }
	    finally {
	      out.close();
	    }
	  }
}

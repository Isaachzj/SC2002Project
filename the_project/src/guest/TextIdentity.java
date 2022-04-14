package guest;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import enumeration.*;

public class TextIdentity {
	public static final String SEPARATOR = "~";
	
	// READING
		public static ArrayList readIDs(String filename) throws IOException {
			// read String from text file
			ArrayList stringArray = (ArrayList)read(filename);
			ArrayList alr = new ArrayList() ;// to store Guests data

	        for (int i = 0 ; i < stringArray.size() ; i++) {
					String st = (String)stringArray.get(i);
					// get individual 'fields' of the string separated by SEPARATOR
					StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","

					//tokens
					String  idNumber = star.nextToken().trim();	
					TypeOfID  idType = TypeOfID.values()[Integer.parseInt(star.nextToken().trim())]; //string to int to enum

					// create Guest object from file data (Reservation attribute set to null first
					Identity id = new Identity(idNumber, idType);
					// add to Professors list
					alr.add(id) ;
				}
				return alr ;
		}

		  /** Read the contents of the given file. */
		  public static List read(String fileName) throws IOException {
			List data = new ArrayList() ;
		    Scanner scanner = new Scanner(new FileInputStream(fileName));
		    try {
		      while (scanner.hasNextLine()){
		        data.add(scanner.nextLine());
		      }
		    }
		    finally{
		      scanner.close();
		    }
		    return data;
		  }	
		
		
		
		
		
		
		
		
		
		  // SAVING
		public static void saveIDs(String idFilename, List al) throws IOException { //List is the list of guest objects (Hotel guest list)
				List alw = new ArrayList() ;// to store Guest data
		
		        for (int i = 0 ; i < al.size() ; i++) {
						Identity id = ((Guest)al.get(i)).getIdentity();
						StringBuilder st =  new StringBuilder() ;
						st.append(id.getIdNumber().trim());
						
						st.append(SEPARATOR);
						
						st.append(Integer.toString(id.getIdType().ordinal()).trim()); //convert enum index (int) to string then trim						
						alw.add(st.toString()) ;
					}
					write(idFilename,alw);
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



		  
		  
		  
		  
		  
		  
		public static void main(String[] aArgs)  {
		    	GuestText gt = new GuestText();
		    	String filename = "C:\\Users\\sharo\\eclipse-workspace\\Serializer and Deserializer\\src\\codes\\professor.txt" ;
				try {
					// read file containing Professor records.
					ArrayList al = gt.readGuests(filename) ;
					for (int i = 0 ; i < al.size() ; i++) {
							Professor prof = (Professor)al.get(i);
							System.out.println("Name " + prof.getName() );
							System.out.println("Contact " + prof.getContact() );
					}
					Professor p1 = new Professor("Joseph","jos@ntu.edu.sg",67909999);
					// al is an array list containing Professor objs
					al.add(p1);
					// write Professor record/s to file.
					TextDB.saveProfessors(filename, al);
				}
				catch (IOException e) {
					System.out.println("IOException > " + e.getMessage());
				}
		}

}



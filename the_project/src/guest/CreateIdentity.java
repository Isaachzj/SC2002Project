package guest;
import enumeration.TypeOfID;
import java.util.Scanner;

public class CreateIdentity {
	/**
	 * Instantiation of identification for the guest
	 * Given options of identification using driving license, NRIC or passport number
	 * Different types of identifications enumerated accordingly (Type: driving license, NRIC or passport 
	 * number)
	 * @return this is the identification number of the guest
	 */
	public static Identity createIdentity() {
		Scanner sc = new Scanner(System.in);
		TypeOfID idtype;
		System.out.println("--------- Enter Identity details ----------");
		System.out.println("Select 1 for IDTYPE Driving License");
		System.out.println("Select 2 for IDTYPE NRIC");
		System.out.println("Select ANY OTHER NUMBER for IDTYPE Passport");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your Identification Number: ");
		String IDnumber = sc.nextLine();
		switch(choice) {
			case 1:
				idtype = TypeOfID.DRIVING_LICENSE;
				break;
			case 2:
				idtype = TypeOfID.NRIC;
				break;
			default:
				idtype = TypeOfID.PASSPORT;
		}
		Identity id = new Identity(IDnumber, idtype);
		System.out.println();
		return id;
	}
}

package guest;
import enumeration.TypeOfID;
import java.util.Scanner;

public class CreateIdentity {
	public static Identity createIdentity() {
		Scanner sc = new Scanner(System.in);
		TypeOfID idtype;
		System.out.println("--------- Enter Identity details ----------");
		System.out.println("Select 1 for IDTYPE Driving License");
		System.out.println("Select 2 for IDTYPE NRIC");
		System.out.println("Select ANY OTHER NUMBER for IDTYPE Passport");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your Identification number: ");
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

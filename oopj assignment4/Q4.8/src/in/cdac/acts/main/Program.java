package in.cdac.acts.main;
import in.cdac.acts.test.PatientTest;

public class Program {
	public static void main(String[] args) {
		int choice;
		PatientTest test = new PatientTest();
		while( ( choice = PatientTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:test.acceptRecord();
				
				break;
			case 2:
				test.calculateTotalBill();
				break;
			case 3:
				test.printRecord();
				break;
			default:System.out.println("Enter valid Choice");
			break;
			}
		}
	}
}

package in.cdac.acts.main;
import in.cdac.acts.test.VehicleTest;

public class Program {
	public static void main(String[] args) {
		int choice;
		VehicleTest test = new VehicleTest();
		while( ( choice = VehicleTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:test.acceptRecord();
				
				break;
			case 2:
				;
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

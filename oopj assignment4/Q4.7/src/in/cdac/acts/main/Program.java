package in.cdac.acts.main;
import in.cdac.acts.test.StudentTest;

public class Program {
	public static void main(String[] args) {
		int choice;
		StudentTest test = new StudentTest();
		while( ( choice = StudentTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:test.acceptRecord();
				
				break;
			case 2:
				test.printRecord();
				break;
			default:System.out.println("Enter valid Choice");
			break;
			}
		}
	}
}

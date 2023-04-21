package in.cdac.acts.main;
import in.cdac.acts.test.AccountTest;

public class Program {
	public static void main(String[] args) {
		int choice;
		AccountTest test = new AccountTest();
		while( ( choice = AccountTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				test.acceptRecord();
				break;
			case 2:
				test.calculateTotalBalance();
				break;
			case 3:
				test.printRecord();
				break;
			}
		}
	}
}

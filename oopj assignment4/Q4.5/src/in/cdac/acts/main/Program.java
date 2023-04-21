package in.cdac.acts.main;
import in.cdac.acts.test.PlayerTest;

public class Program {
	public static void main(String[] args) {
		int choice;
		PlayerTest test = new PlayerTest();
		while( ( choice = PlayerTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				test.acceptRecord();
				break;
			case 2:
				test.calculateTotalScore();
				break;
			case 3:
				test.printRecord();
				break;
			}
		}
	}
}

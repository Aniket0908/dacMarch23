package in.cdac.acts.main;

import in.cdac.acts.test.BookTest;

public class Program {
	public static void main(String[] args) {
		int choice;
		BookTest test = new BookTest();
		while( ( choice = BookTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				test.acceptRecord();
				break;
			case 2:
				test.calculateTotal();
				break;
			case 3:
				test.printRecord();
				break;
			}
		}
	}
}

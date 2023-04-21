package in.cdac.acts.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import in.cdac.acts.domain.CalorieComparator;
import in.cdac.acts.domain.Menu;
import in.cdac.acts.domain.NameComparator;
import in.cdac.acts.domain.PriceComparator;

public class Program {
	
	public static Menu[] getArray() {
		Menu[] arr = new Menu[5];
		arr[0] = new Menu("Palak Paneer",220.00,1200);
		arr[1] = new Menu("Kaju Paneer",250.32,1100);
		arr[2] = new Menu("Nargis Kofta",210.25,900);
		arr[3] = new Menu("Chicken Curry",320.25,1456);
		arr[4] = new Menu("Fish Curry",318.00,1400);
		return arr;
	}
	public static void printRecord(Menu[] arr) {
		if(arr!=null) {
			for (Menu menu : arr) {
				System.out.println(menu);
			}
		}
		System.out.println();
	}
	private static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Name.");
		System.out.println("2.Price.");
		System.out.println("3.Calorie.");	
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		 Menu[] mn = Program.getArray();
		
		 
		 int choice;
		 while( ( choice = Program.menuList( ) ) != 0 ) {
				Comparator<Menu> comparator = null;
				switch( choice ) {
				case 1:
					comparator = new NameComparator();
					break;
				case 2:
					comparator = new PriceComparator();
					break;
				case 3:
					comparator = new CalorieComparator();
					break;
				}
				Arrays.sort(mn, comparator);
				Program.printRecord(mn);
			}
		 
	}
}

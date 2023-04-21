package bmicalculator;

import java.util.Scanner;

public class BookTest {
	 private  Book bk = new Book() ;
		private static Scanner sc=new Scanner(System.in);;

	public void acceptData() {
		System.out.println("Enter the title of Book:");
		sc.nextLine();
		bk.setTitle(sc.nextLine());
		
		System.out.println("Enter the author of Book:");
		bk.setAuthhor(sc.nextLine());
		
		System.out.println("Enter the publisher of Book:");
		bk.setPublisher(sc.nextLine());
		
		System.out.println("Enter the isbn of Book:");
		bk.setIsbn(sc.nextLine());
		
		System.out.println("Enter the year of Book:");
		bk.setYear(sc.nextInt());
		
		System.out.println("Enter the price of Book:");
		bk.setPrice(sc.nextDouble());
		
		System.out.println("Enter the quantity of Book:");
		bk.setQuantity(sc.nextInt());
	}
	public void printData()
	{
		System.out.println("Title: " +bk.getTitle());
		System.out.println("Author: " +bk.getAuthhor());
		System.out.println("Publisher: " +bk.getPublisher());
		System.out.println("ISBN: " +bk.getIsbn());
		System.out.println("Year: " +bk.getYear());
		System.out.println("Price: " +bk.getPrice());
		System.out.println("Quantity: " +bk.getQuantity());
	}
	public static int menuList( ){
	    System.out.println("0.Exit");
	    System.out.println("1.Accept Record.");
	    System.out.println("2.Print Record");
	    System.out.println("3.Decrease Record");
	    System.out.println("4.Increase Record");
	    System.out.print("Enter choice  : ");
	    return sc.nextInt();
	  }
	public void increaseQantity() {
		System.out.print("Increase Quantity by: ");
		int quantity = sc.nextInt();
		int IncreasedQuantity = bk.getQuantity() + quantity;
		bk.setQuantity(IncreasedQuantity);
	}
	
	public void deccreaseQantity() {
		System.out.print("Increase Quantity by: ");
		int quantity = sc.nextInt();
		int decreasedQuantity = bk.getQuantity()- quantity;
		bk.setQuantity(decreasedQuantity);
	}
	public double getInventoryValue() {
		double inval = bk.getQuantity()*bk.getPrice();
		return inval;
	}
	public static void main(String[] args) {
		BookTest bt = new BookTest();
		
		int choice;
		while((choice=menuList())!=0) {
			switch(choice) {
			case 1: bt.acceptData();
				break;
			case 2: bt.printData();
				break;
			case 3:bt.deccreaseQantity() ;
				break;
			case 4:bt.increaseQantity();
				break;
			default:System.out.println("Enter valid choice");
				break;
					
			}
		}
	}
	
	
}

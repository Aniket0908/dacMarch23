package telephone;

import java.util.Scanner;

public class TelephoneTest {
	private TelephoneBill tb = new TelephoneBill();
	private static Scanner sc = new Scanner(System.in);
	void acceptRecord() {
		System.out.print("Enter Customer Name: ");
		tb.setCustomerName(sc.nextLine());
		System.out.print("Enter Phone Number: ");
		tb.setPhoneNumber(sc.nextLine());
		System.out.print("Enter number of calls: ");
		tb.setNumberOfCalls(sc.nextInt());
		System.out.print("Enter Duration: ");
		tb.setDuration(sc.nextDouble());
	}
	void calculateBill() {
		double bill;
		if(tb.getNumberOfCalls()<100) {
			bill = tb.getDuration()*0.5;
			if(bill<10)
				bill=10;
		}
		else {
			bill = tb.getDuration()*0.25;
			if(bill<10)
				bill=10;
		}
		System.out.println("The Telephone bill is: "+bill);
	}
	void printRecord() {
		System.out.println("Customer Name: "+tb.getCustomerName());
		System.out.println("Telephone Number: "+tb.getPhoneNumber());
		calculateBill();
	}
	public static void main(String[] args) {
		TelephoneTest tt = new TelephoneTest();
		tt.acceptRecord();
		tt.printRecord();
	}
}

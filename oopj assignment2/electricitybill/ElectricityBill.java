package electricitybill;

import java.util.Scanner;

public class ElectricityBill {
	String customerName;
	double unitsConsumed;
	double billAmount;
	public ElectricityBill() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of Customer: ");
		this.customerName = sc.nextLine();
		System.out.print("Enter the Number of units Consumed: ");
		this.unitsConsumed = sc.nextDouble();
		sc.close();
	}
	public double calculateBillAmount() {
		
		if(unitsConsumed<=100) {
			this.billAmount = unitsConsumed*5;
			
		}
		else if(unitsConsumed>100 && unitsConsumed<=300) {
			this.billAmount = 100*5 + (unitsConsumed -100)*7;
		}
		else{
			this.billAmount = 100*5 + 200*7 +(unitsConsumed - 300)*10;
		}
		return billAmount;
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter customer name: ");
//		System.out.println("Enter units consumed: ");
		ElectricityBill eb = new ElectricityBill();
		 
		System.out.println("The Bill Amount is: "+eb.calculateBillAmount()+" rs");
		//sc.close();
	}
}

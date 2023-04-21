package in.cdac.acts.test;

import java.util.Scanner;

import in.cdac.acts.domain.Account;
import in.cdac.acts.domain.CheckingAccount;

import in.cdac.acts.domain.SavingsAccount;

public class AccountTest {
	private Account [] arr = new Account[2];
	private static Scanner sc =new Scanner(System.in);
	public AccountTest() {
		arr[0] = new SavingsAccount();
		arr[1] = new CheckingAccount();
	}
	public void acceptRecord() {
		if(arr!=null) {
		for(int index =0;index<this.arr.length;index++) {
			System.out.print("Enter Account Number: ");
			sc.nextLine();
			this.arr[index].setAccountNum(sc.nextLine());
			
			
			if(this.arr[index] instanceof SavingsAccount) {
				SavingsAccount sa = (SavingsAccount)this.arr[index];
				sa.calculateInterest();
				
				
			}
			else {
				CheckingAccount ca = (CheckingAccount) this.arr[index];
				
				
			}
			
		}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Calculate total Score.");
		System.out.println("3.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public void calculateTotalBalance() {
		double total =0;
		for(Account a:arr) {
			total = total + a.getBalance();
		}
		System.out.println("Total : "+total);
	}
	public void printRecord() {
		for(Account a:arr) {
			System.out.println(a.toString());
		}
	}
}

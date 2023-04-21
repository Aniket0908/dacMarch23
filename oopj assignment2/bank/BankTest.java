package bank;

import java.util.Scanner;

public class BankTest {
	BankingManagement bm = new BankingManagement();
	static Scanner sc = new Scanner(System.in);
	public void createAccount() {
		System.out.print("Enter your Name: ");
		sc.nextLine();
		bm.setAccountHolderName(sc.nextLine());
		System.out.println("Enter the Accountno. : ");
		bm.setAccountNumber(sc.nextInt());
		System.out.println("Bank Account created Successfully");
	}
	 public void acceptRecord() {
		 //todo
	 }
	 public static int menuList( ){
		    System.out.println("0.Exit");
		    System.out.println("1.Create Account.");
		    System.out.println("2.Deposit Money");
		    System.out.println("3.Withdraw Money");
		    System.out.println("4.Display Balance");
		    System.out.println("5.Account Details");
		    System.out.print("Enter choice  : ");
		    return sc.nextInt();
		  }
	 public void depositMoney() {
		 System.out.println("Enter Account number:");
		 int accountNumber = sc.nextInt();
		 if(accountNumber == bm.getAccountNumber()) {
		 System.out.println("Enter the Amount to be deposited: ");
		 double amount =sc.nextInt();
		 double balance = bm.getBalance();
		 balance = balance + amount;
		 bm.setBalance(balance);
		 System.out.println("Deposited Succesfully");
		 }
		 else {
			 System.out.println("Enter a Valid Account number");
		 }
	 }
	 
	 public void withdrawMoney() {
		 System.out.println("Enter Account number");
		 int accountNumber =sc.nextInt();
		 if(accountNumber == bm.getAccountNumber()) {
			 System.out.println("Enter the amount to be Withdrawn");
			 double amount =sc.nextInt();
			 if(amount > bm.getBalance()) {
				 System.out.println("Insufficient Balance");
			 }
			 else {
				 double balance = bm.getBalance();
				 balance = balance - amount;
				 bm.setBalance(balance);
			 }
		 }
	 }
	 public void displayAccountBalance() {
		 System.out.println("Enter the Account number");
		 int accountNumber = sc.nextInt();
		 if(accountNumber == bm.getAccountNumber()) {
			 System.out.println("Your account Balance is: "+bm.getBalance());
		 }
		 else {
			 System.out.println("Entered account number is invalid");
		 }
	 }
	 public void displayAccountDetails() {
		 System.out.println("Enter the Account number");
		 int accountNumber = sc.nextInt();
		 if(accountNumber == bm.getAccountNumber()) {
			 System.out.println("Account Holder Name: "+bm.getAccountHolderName());
			 System.out.println("Account Number: "+bm.getAccountNumber());
			 System.out.println("Account Balance: "+bm.getBalance());
		 }
	 }
}

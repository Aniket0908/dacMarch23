package credithistory;

import java.util.Scanner;

public class CreditCalculator {
	private int creditHistory;
	private double creditUtilization;
	private boolean paymentHistory=false;
	
	
	public int getCreditHistory() {
		return creditHistory;
	}
	public void setCreditHistory(int creditHistory) {
		this.creditHistory = creditHistory;
	}
	public double getCreditUtilization() {
		return creditUtilization;
	}
	public void setCreditUtilization(double creditUtilization) {
		this.creditUtilization = creditUtilization;
	}
	public int calculateCreditScore() {
		int creditScore;
		if(paymentHistory==true)
		{
			creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 55;
		}
		else
		{
			 creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 35;
		}
		return creditScore;
	}
	
	public static void main(String[] args) {
		CreditCalculator cc = new CreditCalculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Credit History: ");
		cc.setCreditHistory(sc.nextInt());
		System.out.println("Enter Credit utilization: ");
		cc.setCreditUtilization(sc.nextDouble());
		
		System.out.println("The Credit Score is: " + cc.calculateCreditScore());
		
	}
	
}

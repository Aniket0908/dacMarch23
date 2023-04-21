package in.cdac.acts.domain;

public class SavingsAccount extends Account {
		private double interestRate;
		
		public void calculateInterest() {
			double interest = this.getBalance()*this.interestRate*1/100;
			this.deposit(interest);
		}
}

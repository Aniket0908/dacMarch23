package in.cdac.acts.domain;

public class CheckingAccount extends Account{
		private double overdraftLimit = 1000;
		@Override
		public void withdraw(double amount) {
		if(this.getBalance()-amount>0) {
			setBalance(this.getBalance()-amount);	
		}
		else if(this.getBalance()+1000-amount>0) {
			setBalance(this.getBalance()-amount-20);
		}
		else {
			System.out.println("Overdraft limit exceeded");
		}
		}
}

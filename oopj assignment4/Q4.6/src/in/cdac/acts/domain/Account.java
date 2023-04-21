package in.cdac.acts.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	private String accountNum;
	private double balance;
	
	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
				
	}
	@Override
	public String toString() {
		return String.format("%-15s%-10f", this.accountNum,this.balance);
	}
}

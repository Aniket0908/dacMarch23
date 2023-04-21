package bank;



public class BankProgram {
	public static void main(String[] args) {
		BankTest bt = new BankTest();
		
		int ch;
		while((ch=BankTest.menuList())!=0) {
			switch (ch) {
			case 1:bt.createAccount();
				break;
			case 2:bt.depositMoney();
				break;
			case 3:bt.withdrawMoney();
				break;
			case 4:bt.displayAccountBalance();
				break;
			case 5:bt.displayAccountDetails();
				break;
			default:System.out.println("Enter a valid choice");
				break;
			
			}
		}
	}
	
}

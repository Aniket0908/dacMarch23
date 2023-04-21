package rationalnumber;

import java.util.Scanner;

public class Test{
	RationalNumber rm1 = new RationalNumber();
	RationalNumber rm2 = new RationalNumber();
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter 1st numerator: ");
		rm1.setNumerator(sc.nextInt());
		System.out.println("Enter 1st Denominator: ");
		rm1.setDenominator(sc.nextInt());
		System.out.println("Entee 2nd numerator: ");
		rm2.setNumerator(sc.nextInt());
		System.out.println("Enter 2nd Denominator: ");
		rm2.setDenominator(sc.nextInt());
	}
	public static int gcd(int num1,int num2) {
		int gcd=0;
		for(int i=1 ; i<=num1&&i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public void add() {
		int d1 = rm1.getDenominator();
		int n1 = rm1.getNumerator();
		int n2 = rm2.getNumerator();
		int d2 = rm2.getDenominator();
		int addn = n1*d2+n2*d1;
		int addd = d1*d2;
		int g =gcd(addn, addd);
		addn = addn/g;
		addd = addd/g;
		System.out.println("Result: "+addn+"/"+addd);
	}
	public void subtract() {
		int d1 = rm1.getDenominator();
		int n1 = rm1.getNumerator();
		int n2 = rm2.getNumerator();
		int d2 = rm2.getDenominator();
		int addn = n1*d2-n2*d1;
		int addd = d1*d2;
		int g =gcd(addn, addd);
		addn = addn/g;
		addd = addd/g;
		System.out.println("Result: "+addn+"/"+addd);
	
	}
	public void multiply() {
		int d1 = rm1.getDenominator();
		int n1 = rm1.getNumerator();
		int n2 = rm2.getNumerator();
		int d2 = rm2.getDenominator();
		int addn = n1*n2;
		int addd = d1*d2;
		int g =gcd(addn, addd);
		addn = addn/g;
		addd = addd/g;
		System.out.println("Result: "+addn+"/"+addd);
	}
	public void divide() {
		int d1 = rm1.getDenominator();
		int n1 = rm1.getNumerator();
		int n2 = rm2.getNumerator();
		int d2 = rm2.getDenominator();
		int addn = n1*d2;
		int addd = n2*d1;
		int g =gcd(addn, addd);
		addn = addn/g;
		addd = addd/g;
		System.out.println("Result: "+addn+"/"+addd);
	}
	
	 public static int menuList( ){
		    System.out.println("0.Exit");
		    System.out.println("1.Enter Numbers");
		    System.out.println("2.Add");
		    System.out.println("3.Subtract");
		    System.out.println("4.Multiply");
		    System.out.println("5.Divide");
		    System.out.print("Enter choice  : ");
		    return sc.nextInt();
		  }
	
}

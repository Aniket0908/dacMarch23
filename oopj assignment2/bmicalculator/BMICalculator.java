package bmicalculator;

import java.util.Scanner;

public class BMICalculator {
	double height ;
	double weight ;
	static BMICalculator bi = new BMICalculator();
	public BMICalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public double calculateBMI(double height, double weight) {
		double bmi = height/(weight*weight);
		return bmi;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height in meters: ");
		bi.setHeight(sc.nextDouble());
		System.out.println("Enter the weight in Kg: ");
		bi.setWeight(sc.nextDouble());
		double weight =bi.getWeight();
		double height = bi.getHeight();
		 System.out.println("The BMI value is: "+bi.calculateBMI(height, weight));
		 sc.close();
	}
}

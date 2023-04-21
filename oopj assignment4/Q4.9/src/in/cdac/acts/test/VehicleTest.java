package in.cdac.acts.test;

import java.util.Scanner;

import in.cdac.acts.domain.Car;
import in.cdac.acts.domain.Motorcycle;
import in.cdac.acts.domain.Truck;
import in.cdac.acts.domain.Vehicle;



public class VehicleTest {
	private Vehicle [] arr = new Vehicle[3];
	private static Scanner sc =new Scanner(System.in);
	public VehicleTest() {
		arr[0] = new Car();
		arr[1] = new Motorcycle();
		arr[2] = new Truck();
		
	}
	public void acceptRecord() {
		if(arr!=null) {
		for(int index =0;index<this.arr.length;index++) {
			System.out.print("Enter Make: ");
			sc.nextLine();
			this.arr[index].setMake(sc.nextLine());
			System.out.println("Enter Model: ");
			this.arr[index].setModel(sc.nextLine());
			System.out.println("Enter Year: ");
			this.arr[index].setYear(sc.nextInt());
			
			if(this.arr[index] instanceof Car) {
				Car car = (Car)this.arr[index];
				System.out.println("Enter daily Rental Rate for car: ");
				car.setDailyRentalRate(sc.nextDouble());
				System.out.print("Enter Number of Doors: ");
				car.setNumDoors(sc.nextInt());
				
			}
			else if(this.arr[index] instanceof Motorcycle){
				Motorcycle mc = (Motorcycle)this.arr[index];
				System.out.println("Enter daily Rental Rate for motorcycle: ");
				mc.setDailyRentalRate(sc.nextDouble());
				System.out.print("Enter Engine Size : ");
				mc.setEngineSize(sc.nextInt());
			}
			else {
				Truck truck = (Truck)this.arr[index];
				System.out.println("Enter daily Rental Rate for truck: ");
				truck.setDailyRentalRate(sc.nextDouble());
				System.out.print("Enter Engine Size : ");
				truck.setCargoSize(sc.nextDouble());
			}
			this.arr[index].calculateRentalFee(5);
		}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Enter Vehicle Details.");
		System.out.println("2.Calculate Total Rental Fee.");
		System.out.println("3.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
//	public void calculateTotalBill() {
//		double total =0;
//		for(Patient p:arr) {
//			total = total +p.getBill();
//		}
//		System.out.println("Total Bill Of Patient : "+total);
//	}
	public void printRecord() {
		if(arr!=null) {
		for(int index=0;index<this.arr.length;index++) {
			System.out.println("Total"+this.arr[index].getClass().getSimpleName()+"Rental:"+this.arr[index].getTotalRental());
		}
		}
	}
}

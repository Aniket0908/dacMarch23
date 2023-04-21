package in.cdac.acts.test;

import java.util.Scanner;


import in.cdac.acts.domain.InPatient;
import in.cdac.acts.domain.OutPatient;
import in.cdac.acts.domain.Patient;


public class PatientTest {
	private Patient [] arr = new Patient[2];
	private static Scanner sc =new Scanner(System.in);
	public PatientTest() {
		arr[0] = new InPatient();
		arr[1] = new OutPatient();
	}
	public void acceptRecord() {
		if(arr!=null) {
		for(int index =0;index<this.arr.length;index++) {
			System.out.print("Enter Patient Name: ");
			sc.nextLine();
			this.arr[index].setName(sc.nextLine());
			System.out.println("Enter PatientID: ");
			this.arr[index].setId(sc.nextInt());
			System.out.println("Enter age: ");
			this.arr[index].setAge(sc.nextInt());
			
			if(this.arr[index] instanceof InPatient) {
				InPatient ip = (InPatient)this.arr[index];
				System.out.print("Enter Number of Days: ");
				ip.setNumberOfDays(sc.nextInt());
				System.out.print("Enter Room Charges: ");
				ip.setRoomCharges(sc.nextDouble());
				System.out.print("Enter Medicine Charges: ");
				ip.setMedicineCharges(sc.nextDouble());
				
			}
			else {
				OutPatient op = (OutPatient) this.arr[index];
				System.out.print("Enter Doctor Fees : ");
				op.setDoctorFees(sc.nextDouble());
				System.out.print("Enter Test Charges : ");
				op.setTestCharges(sc.nextDouble());
				
			}
			arr[index].calculateBill();
		}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Enter Patient Details.");
		System.out.println("2.Calculate Bill.");
		System.out.println("3.Print Bill.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public void calculateTotalBill() {
		double total =0;
		for(Patient p:arr) {
			total = total +p.getBill();
		}
		System.out.println("Total Bill Of Patient : "+total);
	}
	public void printRecord() {
		for(Patient p:arr) {
			System.out.println(p.toString());
		}
	}
}

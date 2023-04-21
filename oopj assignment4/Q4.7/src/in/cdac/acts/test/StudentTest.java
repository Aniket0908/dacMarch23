package in.cdac.acts.test;


import java.util.Scanner;

import in.cdac.acts.domain.GraduateStudent;

import in.cdac.acts.domain.Student;
import in.cdac.acts.domain.UnderGraduateStudent;


public class StudentTest {
	private Student [] arr = new Student[2];
	private static Scanner sc =new Scanner(System.in);
	public StudentTest() {
		arr[0] = new GraduateStudent();
		arr[1] = new UnderGraduateStudent();
	}
	public void acceptRecord() {
		if(arr!=null) {
		for(int index =0;index<this.arr.length;index++) {
			System.out.print("Enter Student Name: ");
			sc.nextLine();
			this.arr[index].setName(sc.nextLine());
			System.out.print("Enter StudentID: ");
			this.arr[index].setId(sc.nextInt());
			System.out.print("Enter Major: ");
			sc.nextLine();
			this.arr[index].setMajor(sc.nextLine());
			System.out.print("Enter GPA: ");
			this.arr[index].setGpa(sc.nextDouble());
			
			if(this.arr[index] instanceof UnderGraduateStudent) {
				UnderGraduateStudent ugs = (UnderGraduateStudent)this.arr[index];
				System.out.print("Enter Credit Hours: ");
				ugs.setCreditHours(sc.nextInt());
			}
			else {
				GraduateStudent gs = (GraduateStudent) this.arr[index];
				System.out.print("Enter Research Fee : ");
				gs.setResearchFee(sc.nextDouble());
				System.out.print("Enter Credithours : ");
				gs.setCreditHours(sc.nextInt());
				
			}
			arr[index].calculateTution();
		}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Enter Student Details.");
		System.out.println("2.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	public void printRecord() {
		if(arr!=null) {for(Student s:arr) {
			System.out.println(s.toString());
		}
		}
	}
}

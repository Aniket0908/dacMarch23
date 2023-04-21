package in.cdac.acts.domain;

import java.util.Scanner;

public class ProductTest {
	Products[] arr = new Products[5];
	Scanner sc = new Scanner(System.in);
	public void acceptRecord(Products[] p) {
		 for(int index = 0 ; index<arr.length;index++) {
			 p[index] = new Products();
				System.out.print("Enter Product Name: ");
				p[index].setName(sc.nextLine());
				System.out.print("Enter Product Price: ");
				p[index].setPrice(sc.nextDouble());
				sc.nextLine();
				System.out.print("Enter Category: ");
				sc.nextLine();
				p[index].setCategory(sc.nextLine());
			
		 }	
	}
	
	public  Products[] getArray() {
		return this.arr;
	}
	public void printRecord(Products[] arr) {
		if(arr!=null) {
			for (Products product : arr) {
				System.out.println(product);
			}
		}
		System.out.println();
	}
}

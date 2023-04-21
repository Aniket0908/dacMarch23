package in.cdac.acts.test;

import java.util.Scanner;

import in.cdac.acts.domain.Book;
import in.cdac.acts.domain.FictionBook;
import in.cdac.acts.domain.NonFiction;
import in.cdac.acts.domain.ReferenceBook;

public class BookTest {
		private Book  [] arr = new Book[5]; 
		private static Scanner sc = new Scanner(System.in);
		public BookTest() {
			arr[0] = new ReferenceBook();
			arr[1] = new FictionBook();
			arr[2] = new NonFiction();
			arr[3] = new ReferenceBook();
			arr[4] = new NonFiction();
			
		}
		public void acceptRecord() {
			for(int index =0;index<this.arr.length;index++) {
				System.out.print("Enter Title: ");
				sc.nextLine();
				this.arr[index].setTitle(sc.nextLine());
				System.out.print("Enter Author: ");
				this.arr[index].setAuthor(sc.nextLine());
				System.out.print("Enter Publisher: ");
				this.arr[index].setPublisher(sc.nextLine());
				System.out.print("Enter Number of Pages: ");
				this.arr[index].setNumPages(sc.nextInt());
				if(this.arr[index] instanceof ReferenceBook) {
					ReferenceBook ref = (ReferenceBook)this.arr[index];
					ref.calculatePrice();
					ref.setPrice(ref.calculatePrice());
				}
				if(this.arr[index] instanceof FictionBook) {
					FictionBook fic = (FictionBook)this.arr[index];
					System.out.println("Enter the genre: ");
					sc.nextLine();
					fic.setGenre(sc.nextLine());
					fic.calculatePrice();
					fic.setPrice(fic.calculatePrice());
				}
				if(this.arr[index] instanceof NonFiction) {
					NonFiction nf = (NonFiction)this.arr[index];
					System.out.println("Enter subject: ");
					sc.nextLine();
					nf.setSubject(sc.nextLine());
					nf.calculatePrice();
					nf.setPrice(nf.calculatePrice());
				}
				
			}
		}
		public void calculateTotal() {
			double total=0;
			for(Book b:this.arr) {
				total = total+b.getPrice();
			}
			System.out.println("Total price of Books : "+total);
		}
		public void printRecord() {
			for(Book b:this.arr) {
				System.out.println(b.toString());
			}
		}
		
		public static int menuList( ) {
			System.out.println("0.Exit.");
			System.out.println("1.Accept Record.");
			System.out.println("2.Calculate total price.");
			System.out.println("3.Print Record.");
			System.out.print("Enter choice	:	");
			return sc.nextInt();
		}
}

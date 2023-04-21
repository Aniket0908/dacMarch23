package in.cdac.acts.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Library {
	public static Book[] getArray() {
		Book[] arr = new Book[5];
		arr[0] = new Book("Wings of Fire","Abdul Kalam",2001);
		arr[1] = new Book("Lord of the Rings","Tolkien",2000);
		arr[2] = new Book("Harry Potter","Rowling",2005);
		arr[3] = new Book("Fire and Blood","Lewis Caroll",2003);
		arr[4] = new Book("Marvel Comics","Stan lees",2002);
		return arr;
	}
	public static void printRecord(Book[] arr) {
		if(arr!=null) {
			for (Book book : arr) {
				System.out.println(book);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
           Book[] book = Library.getArray();
           Library.printRecord(book);
//           Arrays.sort(book);
//           Library.printRecord(book);
           ArrayList<Book> list = new ArrayList<>();
           list.add(book[0]);
           list.add(book[1]);
           list.add(book[2]);
           list.add(book[3]);
           list.add(book[4]);
           Collections.sort(list);
           System.out.println(list);
           
	}
}

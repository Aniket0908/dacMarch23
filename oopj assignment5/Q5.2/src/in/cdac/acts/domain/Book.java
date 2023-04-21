package in.cdac.acts.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class Book implements Comparable<Book> {
		String title;
		String author;
		int year;
		
		@Override
		public String toString() {
		return String.format("%-20s%-15s%-5d", this.title,this.author,this.year);
		}

		@Override
		public int compareTo(Book o) {
			
			return this.year-o.year;
		}
		
}

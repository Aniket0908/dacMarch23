package in.cdac.acts.domain;

public class Book {
		private String title;
		private String author;
		private String publisher;
		private double price;
		private int numPages;
		public Book() {
			
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
					+ ", numPages=" + numPages + "]";
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getNumPages() {
			return numPages;
		}
		public void setNumPages(int numPages) {
			this.numPages = numPages;
		}
		
		public double calculatePrice() {
			return this.price;
		}
}

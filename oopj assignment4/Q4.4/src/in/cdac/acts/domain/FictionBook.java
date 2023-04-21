package in.cdac.acts.domain;

public class FictionBook extends Book {
	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public double calculatePrice() {
		if(this.genre.equalsIgnoreCase("Romance Novel")) {
			return this.getNumPages()*5*0.9;
		}
		else {
			return this.getPrice()*5;
		}
		
	}
}

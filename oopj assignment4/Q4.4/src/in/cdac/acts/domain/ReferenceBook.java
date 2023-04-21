package in.cdac.acts.domain;

public class ReferenceBook extends Book {
	private int edition;

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public double calculatePrice() {
		if(this.edition < 5) {
			return this.getNumPages()*5*0.8;
		}
		else {
			return this.getNumPages()*5;
		}
		
	}
	
}

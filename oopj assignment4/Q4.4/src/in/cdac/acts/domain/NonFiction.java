package in.cdac.acts.domain;

public class NonFiction extends Book {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public double calculatePrice() {
		if(this.subject.equalsIgnoreCase("history")) {
			return this.getNumPages()*5*0.85;
		}
		else {
			return this.getNumPages()*5;
		}
	}
}

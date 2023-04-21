package in.cdac.acts.domain;

import lombok.Setter;

public class InPatient extends Patient {
	@Setter private int numberOfDays;
	@Setter	private double roomCharges;
	@Setter	private double medicineCharges;
		
	
	@Override
	public void calculateBill() {
		if(this.getAge()>60) {
		double bill = this.numberOfDays*this.roomCharges + this.medicineCharges*0.9;
		this.setBill(bill);
		}
		else {
			double bill = this.numberOfDays*this.roomCharges + this.medicineCharges;
			this.setBill(bill);
		}
	}
}

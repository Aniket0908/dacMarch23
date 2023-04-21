package in.cdac.acts.domain;

import lombok.Setter;

public class OutPatient extends Patient {
	@Setter private double doctorFees;
	@Setter	private double testCharges;
	
	@Override
	public void calculateBill() {
		if(this.getAge()>60) {
		double bill = this.doctorFees + this.testCharges*0.95;
		this.setBill(bill);
		}
		else {
			double bill = this.doctorFees + this.testCharges;
			this.setBill(bill);
		}
	}
}

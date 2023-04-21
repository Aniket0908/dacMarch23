package in.cdac.acts.domain;

import lombok.Setter;

public class Motorcycle extends Vehicle{
		@Setter private int engineSize;
		
		@Override
		public void calculateRentalFee(int days) {
		if(this.engineSize>1000) {
			this.totalRental = this.getDailyRentalRate()*days+20*days;
		}
		else {
			this.totalRental = this.getDailyRentalRate()*days+20*days;
		}
		}
}

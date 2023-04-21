package in.cdac.acts.domain;

import lombok.Setter;

public class Truck extends Vehicle{
		@Setter private  double cargoSize;
		
		@Override
		public void calculateRentalFee(int days) {
		if(this.cargoSize>5000) {
			this.totalRental = this.getDailyRentalRate()*days + 30*days;
		}
		else {
			this.totalRental = this.getDailyRentalRate()*days;
		}
		}
		
}

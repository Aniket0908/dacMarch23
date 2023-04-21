package in.cdac.acts.domain;

import lombok.Setter;

public class Car extends Vehicle{
		@Setter private int numDoors;
		
		
		@Override
		public void calculateRentalFee(int days) {
		if(this.numDoors>2) {
			this.totalRental = this.getDailyRentalRate()*days + 10*days;
		}
		else {
			this.totalRental = this.getDailyRentalRate()*days ;
		}
		}
		
		
		
}

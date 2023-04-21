package in.cdac.acts.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Vehicle {
	private String make;
	private String model;
	private int year;
	private double dailyRentalRate;
	protected double totalRental;
	public void calculateRentalFee(int days) {
		
	}
}

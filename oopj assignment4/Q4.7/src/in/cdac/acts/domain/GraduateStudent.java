package in.cdac.acts.domain;

import lombok.Setter;

public class GraduateStudent extends Student {
		@Setter private int creditHours;
		@Setter private double researchFee;
		private double tutionRate =1000;
		@Override
		public void calculateTution() {
			if(this.researchFee>5000) {
				this.tutionFee = this.creditHours*this.tutionRate*0.9;
			}
			else {
				this.tutionFee = this.creditHours*this.tutionRate;
			}
		}
}

package in.cdac.acts.domain;


import lombok.Setter;

public class UnderGraduateStudent extends Student {
		@Setter private int creditHours;
		 private double tutionRate =500;
		
		@Override
		public void calculateTution() {
			if(this.getGpa()>3.5) {
				this.tutionFee = this.creditHours*this.tutionRate*0.8;
			}
			else {
				this.tutionFee = this.creditHours*this.tutionRate;
			}
		}
}

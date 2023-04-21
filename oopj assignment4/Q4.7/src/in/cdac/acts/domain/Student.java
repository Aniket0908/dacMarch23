package in.cdac.acts.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Student {
		private String name;
		private int id;
		private String major;
		private double gpa;
		protected double tutionFee;
		public void calculateTution() {
			
		}
}

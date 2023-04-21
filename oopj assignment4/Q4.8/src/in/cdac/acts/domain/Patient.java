package in.cdac.acts.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Patient {
		
		@Setter private String name;
		@Setter private int id;
		@Getter @Setter private int age;
		@Setter @Getter private double bill;
		
		public void calculateBill() {
			
		}
		
}

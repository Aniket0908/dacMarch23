package in.cdac.acts.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class Menu {
		private String name;
		private double price;
		private int calorieCount;
		
		
		@Override
		public String toString() {
		return String.format("%-15s%-15.2f%-7d", this.name,this.price,this.calorieCount);
		}
}

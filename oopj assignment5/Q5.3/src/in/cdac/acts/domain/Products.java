package in.cdac.acts.domain;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class Products  {
		private String name;
		private double price;
		private String category;
		
		
		
		@Override
		public String toString() {
		return String.format("%-15s%-10f%-15s", this.name,this.price,this.category);
		}



		


		
		
}

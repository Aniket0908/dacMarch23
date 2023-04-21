package in.cdac.acts.domain;

import java.util.Comparator;

public class CalorieComparator implements Comparator<Menu> {

	@Override
	public int compare(Menu o1, Menu o2) {
		
		return o1.getCalorieCount()-o2.getCalorieCount();
	}
	
		
}

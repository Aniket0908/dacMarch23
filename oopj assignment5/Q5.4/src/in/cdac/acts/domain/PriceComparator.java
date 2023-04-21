package in.cdac.acts.domain;

import java.util.Comparator;

public class PriceComparator implements Comparator<Menu>{

	@Override
	public int compare(Menu o1, Menu o2) {
		
		return (int) (o1.getPrice()-o2.getPrice());
	}

}

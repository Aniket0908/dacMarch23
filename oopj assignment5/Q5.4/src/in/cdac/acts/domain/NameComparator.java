package in.cdac.acts.domain;

import java.util.Comparator;

public class NameComparator implements Comparator<Menu>{

	@Override
	public int compare(Menu o1, Menu o2) {
		return o1.getName().compareTo(o2.getName());
	}
	

}

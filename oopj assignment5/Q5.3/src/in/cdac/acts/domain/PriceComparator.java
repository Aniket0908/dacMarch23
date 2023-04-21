package in.cdac.acts.domain;

import java.util.Comparator;

public class PriceComparator implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		return (int) (o1.getPrice() - o2.getPrice());
	}

}

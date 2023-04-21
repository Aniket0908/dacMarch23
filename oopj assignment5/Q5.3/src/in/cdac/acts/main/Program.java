package in.cdac.acts.main;

import java.util.Arrays;
import java.util.Comparator;

import in.cdac.acts.domain.PriceComparator;
import in.cdac.acts.domain.ProductTest;
import in.cdac.acts.domain.Products;

public class Program {
	public static void main(String[] args) {
		ProductTest pt = new ProductTest();
	 	Products[] p =  pt.getArray();
		pt.acceptRecord(p);
		pt.printRecord(p);
		Comparator<Products> comparator = new PriceComparator();
		Arrays.sort(p, comparator);
		pt.printRecord(p);
	}
}

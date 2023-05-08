package question15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program {
	public static void removeDuplicates(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i]))
			list.add(arr[i]);
		}
		
		Object[] ab = list.toArray();
		System.out.println(Arrays.toString(ab));
	}
	public static void main(String[] args) {
		int[] arr = {1,5,5,7,9,4,1,7,6,8,9,4};
		removeDuplicates(arr);
	}
}

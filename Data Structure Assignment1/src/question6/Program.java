package question6;

import java.util.Arrays;
import java.util.HashSet;

public class Program {
	public static void oddOccurence(int[] arr) {
		HashSet<Integer> s = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
		if(s.contains(arr[i])) {
			s.remove(arr[i]);
		}
		else{s.add(arr[i]);}
		}
		int[] a = new int[s.size()];
		int b=0;
		for (Integer integer : s) {
			a[b] =integer;
			b=b+1;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,5,5,4,8,4,7,1,2,4,6,6,2,1,5,1,4};
		Program.oddOccurence(arr);
	}
}

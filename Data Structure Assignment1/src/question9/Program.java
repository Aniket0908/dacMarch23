package question9;

import java.util.ArrayList;

public class Program {
	public static void getDuplicate(int[] arr) {
		boolean ispresent = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					if(list.contains(arr[i])) {
						break;
					}
				
					else {
					list.add(arr[i]);
					ispresent=true;
					}
				}
			}
		}
		if(ispresent==true) {
			System.out.println(list);
		}
		else {
			System.out.println("No Duplicate Elements");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,1,25,4,5,6,4,2,4,6,7,8,9};
		getDuplicate(arr);
	}
}

package question3;

import java.util.Arrays;

public class Program {
	public static void print2largest(int[] arr) {
		if(arr.length<2) {
			System.out.println("only one element present");
		}
		Arrays.sort(arr);
		
		for(int i = arr.length-2;i>0;i--) {
		if(arr[arr.length-1]!=arr[i]) {
			System.out.println("The second largest element is: "+arr[i]);
			return;
			}
		
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {4,48,64,68,41,21,35,67};
		print2largest(arr);
	}
}

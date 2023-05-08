package question14;

import java.util.Arrays;

public class Program {
	public static void revArray(int[] arr,int size) {
		int temp;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp ;
		}
		System.out.println(Arrays.toString(arr));

	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int size  = arr.length;
		Program.revArray(arr, size);
	}
}

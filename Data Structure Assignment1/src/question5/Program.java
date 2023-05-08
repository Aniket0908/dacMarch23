package question5;

public class Program {
	public static void main(String[] args) {
		int[] arr = {12,45,62,35,14,2,26};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
		}
		System.out.println("Maximum number in given array is: "+max);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<min) {
				min = arr[i];
				
			}
		}
		System.out.println("Minimum number in given array is: "+min);
		
	}
}

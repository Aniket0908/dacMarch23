package question2;

public class Program {
	public static int binarySearch(int[] arr,int element) {
		int l = 0;
		int r = arr.length-1;
		while(l<=r) {
			int m = (l+r)/2;
			if(arr[m]==element) {
				return m;
			}
			else if(arr[m]<element) {
				l = m+1;
			}
			else {
				r = m-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int element = 6;
		System.out.println("Element "+element+" found at index "+binarySearch(arr, element));
	}
}

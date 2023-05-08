package question1;

public class Program {
	public static int missingNumber(int[] arr) {
		for(int index=0;index<arr.length-1;index++) {
			if((arr[index]+1)!=arr[index+1]) {
				return arr[index]+1;
			}
			
		}
		return 0;
	}
	public static void main(String[] args) {
//		int [] arr = new int[100];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i+1;
//		}
		int[] arr = {1,2,3,4,5,7,8};
		System.out.println(missingNumber(arr));
	}
}

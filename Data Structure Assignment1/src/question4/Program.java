package question4;

public class Program {
	public static void main(String[] args) {
		int[] arr = {2,6,4,5,1,3,1,2,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}

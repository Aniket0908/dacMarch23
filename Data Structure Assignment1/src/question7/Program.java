package question7;

public class Program {
	
	public static int sumPair(int[] arr,int key) {
		int count= 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum = arr[i] + arr[j];
				if(sum==key) {
					System.out.println("The pairs whose sum is "+key+" = "+arr[i]+"  "+arr[j]);
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,7};
		int key = 7;
		System.out.println(Program.sumPair(arr, key));
	}
}

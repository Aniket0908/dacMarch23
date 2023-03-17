class Pattern18{
	public static void main(String args[]){
		int alpha=64;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=6-i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
		
	}
}
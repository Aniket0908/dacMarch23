class PyramidPattern4{
	public static void main(String args[]){
		
		
		for(int i=1;i<=9;i++)
		{
			for(int k=8;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k1=i;k1>1;k1--)
			{
				System.out.print(k1-1+" ");
			}
			System.out.println( );
		}
	}
}
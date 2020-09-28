class Mindtree3
{
	public static void main(String[] args) 
	{
		int n=4;
		int count=1;
		for (int rows=0;rows<n;rows++) 
		{
			for (int col=0;col<=rows;col++) 
			{
			 System.out.print(count+++" ");	
			}
			System.out.println();
		}

	}
}
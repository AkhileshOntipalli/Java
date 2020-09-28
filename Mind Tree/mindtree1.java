class Mindtree1
{
	public static void main(String[] args) 
	{
		int n =4 ;
		int a = n;

		if(n%2==0)
		{
		  a=n+1;	
		}	
		for (int rows=0;rows<n;rows++ ) 
		{
			for (int col=0;col<a;col++ ) 
			{
				
				if (col==n/2) 
				{
					System.out.print(rows+1+" ");
				}
				else
				{
				   System.out.print(n+" ");
				}
			}		
				System.out.println();
			
		}

	}
}
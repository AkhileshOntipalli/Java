class Mindtree
{
	public static void main(String[] args) 
	{
		int n =3;
		int counter = 1;
		int a = 2;
		for (int  rows=0;rows<n;rows++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				System.out.print(counter++ + " ");
				if (col<n-1) 
				{
					System.out.print("* ");
				}
			}	
				if (rows<n/2) 
				{
					counter=counter+n;
				}
				else
				{
					counter = counter-(a++ * n);
				}	
				System.out.println();
			
		}

	}
}
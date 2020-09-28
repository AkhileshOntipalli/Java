class Pyramid
{
	public static void main(String[] args) 
	{
		int n=15;
		for (int rows=0;rows<n;rows++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				if (rows==0||rows==7||rows=14||col==0||col==7||col==14||rows==col||rows+col==n-1)
					System.out.print("* ");
				else 
					System.out.print(" ");

			}
		}
       System.out.println();
	}
}
class Pattern6{
	public static void main(String[] args) 
	{
		int[][] a1={{1,1,1,1,1,1,1},
					{0,1,1,1,1,1,0},
					{0,0,1,1,1,0,0},
					{0,0,0,1,0,0,0},
					{0,0,1,1,1,0,0},
					{0,1,1,1,1,1,0},
					{1,1,1,1,1,1,1}};
		for (int i=0;i<a1.length;i++ ) 
		{
			for (int j=0;j<a1.length;j++) 
			{
				if (a1[i][j]==1) 
				{
					System.out.print("*"+" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		
	}
}
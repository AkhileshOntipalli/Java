class clockwise
{
	public static void main(String[] args) 
	{
		int [][] ar = new int[5][5];
		int count =1;
		for (int start=0,end=ar.length-1;start<end;start++,end--) 
		{
		   for (int i=start;i<end;i++) 
		   {
		 	ar[start][i]=count++;	
		   }
		   for (int i=start;i<end;i++) 
		   {
		   	ar[i][end] = count++;	
		   }
		   for (int i=end;i>start;i--) 
		   {
		   	ar[end][i] = count++;	
		   }
		   for (int i=end;i>start;i--) 
		   {
		   	ar[i][start] =count++;	
		   }	
		}
		if (ar.length/2!=0) 
		{
		 ar[ar.length/2][ar.length/2] = count;	
		}
		for (int i=0;i<ar.length;i++) 
		{
		 for (int j=0;j<ar[i].length;j++) 
		 {
		  System.out.print(ar[i][j]+" ");		
		 }
		 System.out.println();	
		} 
	}
}
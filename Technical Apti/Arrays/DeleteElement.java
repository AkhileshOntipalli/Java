class DeleteElement
{
	public static void DeleteElement(int[] ar)
	{
		int n = ar.length;
		for (int i=0;i<n;i++) 
		{
		  for (int j=i+1;j<n;j++) 
		  {
		 	if(ar[i]==ar[j])
		 	{
		 		int k=j;
		 	    while(k<n-1)
		 	    {
		 	 	 ar[k]=ar[k+1];
		 	 	 k++;
		 	    } 
		 	 n--;
		 	 j--;
		 	}	
		  }	
		}
		for (int i=0;i<n;i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int ar[]={3,2,31,1,2,5,5};
		DeleteElement(ar);
		
	}
}
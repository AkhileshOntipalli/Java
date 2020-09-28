class Consecutiveoccur
{
	public static void DeleteElement(int[] ar)
	{
		int n = ar.length;
		for (int i=0;i<n;i++) 
		{
			int count =1;
		  for (int j=i+1;j<n;j++) 
		  {
		 	if(ar[i]==ar[j] && ar[i+1]==ar[j])
		 	{
		 		count++;
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
		  System.out.println(ar[i]+"is occured for "+count+" times");	
		}
	}
	public static void main(String[] args) 
	{
		int ar[]={1,1,1,2,1,2,2};
		DeleteElement(ar);
		
	}
}
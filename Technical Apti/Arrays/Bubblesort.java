class Bubblesort
{
	public static int[] sort(int[] ar)
	{
      for (int i=0;i<ar.length;i++) 
      {
      	for (int j=i+1;j<ar.length;j++) 
      	{
      		if(ar[i]>ar[j])
      		{
              ar[i]=ar[i]+ar[j];
              ar[j]=ar[i]-ar[j];
              ar[i]=ar[i]-ar[j];
      		} 
      	}
      }
      return ar;
	}
    public static void main(String[] args) 
	{
		int ar[]={2,5,18,7,30,3,9,10,21};
		sort(ar);
		for (int i=0;i<ar.length;i++) 
		{
			System.out.print(ar[i]+" ");
		}
			
	}	
	
}
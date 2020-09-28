class Swap
{
	public static int[] reverse(int[] ar)
	{
		int[] nar = new int[ar.length]; 
		for (int i=0;i<ar.length/2;i++) 
		{
			int temp = ar[i];
		    ar[i]=ar[ar.length-1-i];
		    ar[ar.length-1-i]=temp;
		}
		return nar;
	}
	public static void main(String[] args) 
	{
		int ar[]={12,5,7,8,2};
		int[] nar=reverse(ar);
		for (int i=0;i<ar.length;i++) 
		{
			System.out.print(ar[i]+" ");
		}

	}
	
}

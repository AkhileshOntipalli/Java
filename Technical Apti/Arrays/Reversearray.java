class Reversearray
{
	public static int[] reverse(int[] ar)
	{
		int[] nar = new int[ar.length];
		int a=0;
		for (int i=ar.length-1;i>0;i--) 
		{
			nar[i]=ar[a++];
		}
		return nar;
	}
	public static void main(String[] args) 
	{
		int ar[]={12,5,7,8,2};
		int[] nar=reverse(ar);
		for (int i=0;i<ar.length;i++) 
		{
			System.out.print(nar[i]+" ");
		}
	}
}
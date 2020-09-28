class lesserelement
{
	public static void key(int[] ar,int key)
	{
		for (int i=0;i<ar.length;i++) 
		{
			if (key>ar[i]) 
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int ar[]={2,5,18,10,7};
		int key=10;
		key(ar,key);
	}

}
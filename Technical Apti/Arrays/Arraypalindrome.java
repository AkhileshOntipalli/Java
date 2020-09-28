class Arraypalindrome
{
	public static boolean isPalindrome(int[] ar)
	{
		for(int i=0;i<ar.length/2;i++)
		{
			if (ar[i]!=ar[ar.length-1-i]) 
			{
				return false;
			}
		}
		return true;	
	}
	public static void main(String[] args) 
	{
		int ar[]={1,3,33,3,1};
        boolean res = isPalindrome(ar);
		if(res)
		{
		  System.out.println("array is palindrome");
		}
		else
		{
		  System.out.println("array is not palindrome");
		}	
		
	}
}
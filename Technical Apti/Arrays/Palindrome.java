import java.util.*;
class Palindrome{
	public static void main(String[] args) {
		int a1[]={5,4,1,4,5};
		Boolean flag = true;

		
		for (int i=0;i<a1.length/2;i++) 
		{
			if (a1[i]!=a1[a1.length-1-i]) 
			{
				flag = false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
	}
}
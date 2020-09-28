import java.util.*;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s1 = sc.next();
		Boolean flag = true;

		s1=s1.toLowerCase();
		for (int i=0;i<s1.length()/2;i++) 
		{
			if (s1.charAt(i)!=s1.charAt(s1.length()-1-i)) 
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
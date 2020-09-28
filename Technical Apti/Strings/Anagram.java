import java.util.*;
class Anagram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1  = sc.next();
		String s2  = sc.next();
		
		if (s1.length()!=s2.length()) 
		{
			System.out.println("Both are Not Anagarm");
		}
		else   
		{
			char [] c1 = s1.toCharArray();
			char [] c2 = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			if (Arrays.equals(c1,c2)==true) 
			{
				System.out.println("Both are Anagarm");
			}
			else
			{
				System.out.println("Both are Not Anagarm");
			}
		}
	}
}
import java.util.*;
public class Mainclass3{
	public static char[] ss(String s1,String s2){
		char c1[] = s2.toCharArray();
		char c2[] = s1.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean flag = true;
		for (int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i])
				flag = false;
		}
		if(flag)
			System.out.println("equal");
		else
			System.out.println("Different");
		return c1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		s1.toLowerCase();
		s2.toLowerCase();
		ss(s1,s2);
	}
}
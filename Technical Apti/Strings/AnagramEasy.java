import java.util.Arrays;
import java.util.Scanner;
class AnagramEasy{
	public static void isAnagram(String a,String b){
		if (a.length()!=b.length()){
			System.out.println("Both are not Anagram");
		}
		else{
			char[] c = a.toCharArray();
			char[] d = b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			boolean flag = true;
			for (int i=0;i<c.length;i++ ) {
				if (c[i]!=d[i]) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("Both are Anagram");
			}else
				System.out.println("Both are Not Anagram");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the first word");
		String s1 = sc.next();
		System.out.println(" Please enter the second word");
		String s2 = sc.next();

		s1.toLowerCase();
		s2.toLowerCase();
		isAnagram(s1,s2);
	}
}
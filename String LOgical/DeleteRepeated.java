import java.util.*;
class DeleteRepeated{
	public static void main(String[] args) {
		String s1 = "aaaabdceaaabbbcde";
		String s2 = "";
		
		for (int i=0;i<s1.length();i++) {
			boolean flag = true;
			for (int j=0;j<s1.length();j++ ) {
				if(s1.charAt(i)==s1.charAt(j)&&i>j){
					flag = false;
					break;
				}
			}
			if (flag) {
				s2=s2+s1.charAt(i);
			}
		}
		char c1[] = s2.toCharArray();
		Arrays.sort(c1);
		for (int i=c1.length-1;i>=0;i-- ) {
			System.out.print(c1[i]+" ");
		}
	}
}
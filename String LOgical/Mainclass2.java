import java.util.*;
class Mainclass2{
	public static char[] delete(String s1){
		String s = " ";
		for (int i=0;i<s1.length();i++) {
			boolean flag = true;
			for (int j=0;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j) && i>j){
					flag=false;
					break;
				}
			}
			if(flag){
			 s=s+s1.charAt(i);
			}
		}
		char c1[] = s.toCharArray();
		Arrays.sort(c1);
		for (int i=c1.length-1;i>=0;i-- ) {
			System.out.print(c1[i]+" ");
		}
		return c1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1  = sc.next();
		delete(s1);
	}
}
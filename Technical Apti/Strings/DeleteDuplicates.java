import java.util.*;
class DeleteDuplicates{
	public static char[] deleteDuplicates(String s1){
		String s2=" ";
		for (int i=0;i<s1.length();i++ ) {
			boolean flag = true;
			for (int j=0;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j) && i>j){
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
		for (int i=0;i<c1.length;i++ ) {
			System.out.print(c1[i]+" ");
		}
		return c1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input value");
		String a1 = sc.next();
		deleteDuplicates(a1);
	}
}
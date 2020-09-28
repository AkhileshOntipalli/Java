import java.util.*;
class Delete{
	public static void delete(String s1){
		char c1[] = s1.toCharArray();
		Arrays.sort(c1);
		for (int i=0;i<c1.length;i++ ) {
			System.out.print(c1[i]+" ");
		}
		System.out.println();
		int n=c1.length;
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++ ) {
				if (c1[i]==c1[j]) {
					int k=j;
					while (k<n-1) {
						c1[k]=c1[k+1];
						k++;
					}
					n--;
					j--;
				}
			}
		}
		for (int i=0;i<n;i++) {
			
			System.out.print(c1[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		delete(a1);
	}
}
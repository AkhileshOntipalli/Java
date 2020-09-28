import java.util.Scanner;
class VowelFrequency{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s1 = sc.nextLine();
		s1=s1.toLowerCase();
		char[] c1 = s1.toCharArray();
		int p=0;
		int q=0;
		int r=0;
		int s=0;
		int t=0;
		int v=0;
		s1=s1.toLowerCase();
		for (int j=0;j<c1.length;j++) {
			if (c1[j]=='a') {
				p++;
			}
			else if (c1[j]=='e') {
				q++;
			}
			else if (c1[j]=='i') {
				r++;
			}
			else if (c1[j]=='o') {
				s++;
			}
			else if(c1[j]=='u'){
				t++;
			}
			else if (c1[j]!='a'&& c1[j]!='e'&& c1[j]!='i'&& c1[j]!='o'&& c1[j]!='u'&& c1[j]!=' ') {
				v++;
			}
		}
		System.out.println("Frequency of a is"+ p);
		System.out.println("Frequency of e is"+ q);
		System.out.println("Frequency of i is"+ r);
		System.out.println("Frequency of o is"+ s);
		System.out.println("Frequency of u is"+ t);
		System.out.println("Frequency of consonants is"+ v);
	}
}
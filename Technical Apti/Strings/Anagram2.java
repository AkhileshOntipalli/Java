import java.util.Scanner;
class Anagram2{
	public static boolean isAnagramm(String a,String b){
		a.toLowerCase();
		b.toLowerCase();
		
		if (a.length()!=b.length()) {
			return false;
		}
		int value = 0;  
  
    for (int i = 0; i < a.length(); i++)  
    {  
        value = value ^ (int) a.charAt(i);  
        value = value ^ (int) b.charAt(i);  
    }  
  
    return value == 0;  
  
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		boolean res = isAnagramm(a,b);
		System.out.println((res) ? "Anagrams" : "Not Anagrams");
	}
}
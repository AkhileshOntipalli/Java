import java.util.Scanner;
class Even{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=2; i<=100; i=i+2 ) {
			System.out.println(i);
		}
	}
}
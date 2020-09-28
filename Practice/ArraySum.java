import java.util.Scanner;
class ArraySum{
	public static void main(String... args) {
		 int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Array Size");
		int[] a1 = new int[s.nextInt()];
		System.out.println("Please initialise values");
			for (int j=0;j<a1.length;j++ ) {
				a1[j] = s.nextInt();
				sum +=a1[j];
			}
		    System.out.println(sum);
	}
}
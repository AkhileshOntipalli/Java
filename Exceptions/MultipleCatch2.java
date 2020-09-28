import java.util.*;
class MultipleCatch2{
	public static void test(int n){
		int a1[] = {10,20,30};
		try{
			System.out.println(a1[0]/n);
			System.out.println(a1[n]);
		}
		catch(ArithmeticException ae){
			System.out.println("Catched ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException ie){
			System.out.println("Catched ArrayIndexOutOfBoundsException");
		}
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program Starts=====================");
		System.out.println();
		test(sc.nextInt());
		System.out.println();
		System.out.println("Program Ends=======================");
	
	}
}
import java.util.*;
class MultipleCatch{
	public static void test(int n){
		int a = 100;
		while(true){
		try{
			int res = a/n;
			System.out.println("Result = "+res);		
		}
		catch(ArithmeticException ae){
			System.out.println("Please Enter Non Zero Value");
		}
		catch(InputMismatchException me){
			System.out.println("Please Enter Integer Value");
		}
	  }	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program Starts===============================");
		System.out.println();
		System.out.println("Enter the value");
		test(sc.nextInt());
		System.out.println();
		System.out.println("Program Ends=================================");
	}
}
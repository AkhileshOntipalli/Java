class TryCatch{
	public static void test(int n){
		int a = 100;
		try{
			int res = a/n;
			System.out.println("Result = "+res);
			System.out.println("Hello");
		}
		catch(ArithmeticException ae){
			System.out.println("Caught Arthmetic Exception");
			System.out.println("Inavlid Number");
			System.out.println(ae.toString());
		}
		/*finally{
			System.out.println("Hello World");
			System.out.println("What are You Doing");
		}*/
	}
	public static void main(String[] args) {
		System.out.println("Program Starts=====================");
		System.out.println();
		test(0);
		System.out.println();
		System.out.println("Program Ends=======================");
	}
}
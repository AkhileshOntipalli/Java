class Throws{
	public static void test(int n) throws ArithmeticException{
		int a = 100;
		System.out.println("Result = "+a/n);
	}
	public static void main(String[] args) {
		test(0);
	}
}
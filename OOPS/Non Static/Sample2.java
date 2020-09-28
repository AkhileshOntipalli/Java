class Demo2{
	 int v1 = 100;
	public void test(){
		System.out.println("Value of A = "+v1);
		System.out.println("This is the test()");
	}
}
class Sample2{
	public static void main(String[] args) {
		System.out.println("V1 = "+new Demo2().v1);
		new Demo2().test();
	}
}
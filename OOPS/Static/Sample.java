class Demo{
	static int v1 = 100;
	public static void test(){
		System.out.println("This is the test()");
	}
}
class Sample{
	public static void main(String[] args) {
		System.out.println(Demo.v1);
		Demo.test();
	}
}
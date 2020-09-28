abstract class Sample{
	static int x = 20;
	int y=30;
	abstract public void test();
	
}
class Basic3{
	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println("GM");
		System.out.println("GN");
	}
}
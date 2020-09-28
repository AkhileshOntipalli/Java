abstract class Sample{
	static int y1=30;
	int x1 = 30;
	abstract public void test();
	 public void count(){
	 	System.out.println("Count method of Sample Class");
	}
}
class Demo extends Sample{
	@Override
	public void test(){
		System.out.println("Test Method of Demo Class");
	}
}
class Basic4{
	public static void main(String[] args) {
		Demo d1 =  new Demo();
		d1.count();
		System.out.println(Sample.y1);
		System.out.println(d1.x1);
	}
}
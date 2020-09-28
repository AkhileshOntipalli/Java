interface Run{
	byte c = 58;	
	int b = 20;
	static int a = 30;
	public void test();
}
class Mainclass5 implements Run{
	@Override
	public void test(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
	 	System.out.println(Run.a);
	 	System.out.println(Run.b);
	 	//Run.c = 60;
	 	System.out.println(Run.c);
	 	Run r = new Mainclass5();
	 	r.test();
	 } 
}
interface Run{
	public void test();
}
interface Run1{
	public void test();
}
interface Run2{
	public void test();
}
class Sub implements Run,Run2,Run1{
	public void test(){
		System.out.println("Test");
	}
}
class Mainclass3{
	public static void main(String[] args) {
		/*Sub s = new Sub();
		s.test();*/
		Run r = new Sub();
		r.test();
		Run1 r1 = new Sub();
		r1.test();
	}
}
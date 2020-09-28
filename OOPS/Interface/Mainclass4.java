interface Run{
	public void test();
}
interface Run1{
	public void test();
}
interface Run2 extends Run,Run1{
	public void test();
}
class Sub implements Run,Run2,Run1{
	public void test(){
		System.out.println("Test");
	}
}
class Mainclass4{
	public static void main(String[] args) {
		Sub s = new Sub();
		s.test();
	}
}
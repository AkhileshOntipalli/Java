class Sample1{
	int a = 20;
	public static void test(){
		System.out.println("Test Method");
	} 
}
class Sample2 extends Sample1{
	public void display(){
		int b=40;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
}
class SingleInheritance{
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.test();
		s.display();
	}
}
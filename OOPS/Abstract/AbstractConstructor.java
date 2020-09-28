abstract class Sample{
	public Sample(){
		System.out.println("Abstract Constructor");
	}
	
	abstract public void display();
	public void test(){
		System.out.println("This is the Test Methd of Abstract class");
	} 
}
class ChildClass extends Sample{
	public void display(){
		System.out.println("Display Method of Children Class");
	}
}
class AbstractConstructor{
	public static void main(String[] args) {
		Sample s = new ChildClass();
		s.display();
		s.test();
	}
}
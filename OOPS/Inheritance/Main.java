class Superclass{
	 int a1 = 30;
	final void test(){
		System.out.println("this is superclass test()");
	}
}
class Subclass extends Superclass{
		int b=40;
		
	public void display(){

		System.out.println("This is Subclass test() ");
		System.out.println("B  = "+b);
		System.out.println("a1 = "+a1);
	}	
}
class Main{
	public static void main(String[] args) {
		Subclass s  = new Subclass();
		s.test();
		s.display(); 
	}
}
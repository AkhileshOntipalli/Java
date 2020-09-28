class Parent{
	int a = 10;
	public void display(){
		System.out.println("This is the test() of Parent class");
	}
}
class Child extends Parent{
	int b = 20;
	public void test(){
		System.out.println("This is the test() of Child class");
	} 
}
class Inheritance{
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.display();
		System.out.println(c1.a);
		c1.test();
		System.out.println(c1.b);
	}
}
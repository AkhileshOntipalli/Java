class Parent{
	public void test(){
		System.out.println("Test Method");
	}
}
class Parent2{
	public void count(){
		System.out.println("Count Method");
	}
}
class Child extends ParentParent2{
	public void display(){
		System.out.println("Display Method");
	}
}
class Multiple{
	public static void main(String[] args) {
		Child c  = new Child();
		c.display();
		c.count();
		c.test();
	}
}
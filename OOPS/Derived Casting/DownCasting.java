class Parent{
	public void test(){
		System.out.println("This is Parent test()");
	}
}
class Child extends Parent{
	public void test(){
		System.out.println("This is child test()");
	}
}
class DownCasting{
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = (Child)p;//downcast directly superclass without upcasting
		/*Parent p = new Child();
		Child c = (Child)p;*/
		c.test();

	}
}
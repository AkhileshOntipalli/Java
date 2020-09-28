class Parent{
	public void test(){
		System.out.println("This is test Method");
	}
}
class Child extends Parent {
	//@Override
	public void test(){
		System.out.println("Overriding test() method in child class");
	} 
}
class RunPolymorphism{
	public static void main(String[] args) {
		Parent p = new Child();
		p.test();
	}
}
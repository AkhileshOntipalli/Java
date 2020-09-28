class Parent{
	public void test(){
		System.out.println("This is the parent test method");
	}
}
class Child extends Parent{
	public void view(){
		System.out.println("This is the child test method");
	}
} 
class UpCasting{
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.test();

	}
}
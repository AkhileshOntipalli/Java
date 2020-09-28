interface Run{
	public void test();
	public void display();
}
class Mainclass implements Run{
	public void test(){
		System.out.println("Hello");
	}
	public void display(){
		System.out.println("World");
	}
	public static void main(String[] args) {
		Mainclass m1 = new Mainclass();
		m1.test();
		m1.display();
	}
}

interface Run{
	public static void display(){
		System.out.println("Display of Run");
	}
	public default void test(){
		System.out.println("Hello");
	}
}
interface Run1{
	public static void display(){
		System.out.println("Display of Run1");
	}
	
	public default void test(){
		System.out.println("Hii");
	}
}
class Demo implements Run1,Run{

	public void test(){
		Run.super.test();
		Run1.super.test();
	}
}
class Mainclass{
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.test();
		Run.display();
		Run1.display();
	}
}
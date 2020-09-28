interface Run{
	public static void display(){
		System.out.println("display Method");
	}
	public default void test(){
		System.out.println("Test Method");
	}
}
class Demo implements Run{

}
class Enhancement{
	public static void main(String[] args) {
		Run.display();
		Demo d1 = new Demo();
		d1.test();

	}
}
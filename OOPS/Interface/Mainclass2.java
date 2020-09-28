interface Run{
	public void test();
}
class Mainclass2 implements Run{
	public void test(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts.......");
		Run r;
		
	}
}
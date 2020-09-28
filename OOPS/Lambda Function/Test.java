interface Run{
	public void display();
}
class Test{
	public static void main(String[] args) {
		Run r = ()->{
			System.out.println("this is lambda function");
		};
		r.display();
	}
}
class Blocks{
	static int i;
	double z1;
	static{
		System.out.println("Excecuting Static Block");
		i = 20;
	}
	public Blocks(){
		System.out.println("Executing Constructor");
	}
	{
		System.out.println("Excecuting Non-Static Block");
		z1 = 20.14;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		System.out.println(i);
		Blocks b = new Blocks();
		System.out.println("z1 = "+b.z1);
		System.out.println("Main Method Ends");
	}
}
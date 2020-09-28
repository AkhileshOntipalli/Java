class ConstructorOverloading{
	public ConstructorOverloading(){
		System.out.println("This Is Zero Argument Constructor");
	}
	public ConstructorOverloading(int a){
		System.out.println("This is Integer Constructor");
	}
	public ConstructorOverloading(double b){
		System.out.println(b);
	}
	public ConstructorOverloading(int c,double d,char e){
		System.out.println("This all data Types Constructor");
	}
	public ConstructorOverloading(char e){
		System.out.println("This is char Constructor");
	}
	public static void main(String[] args) {
		new ConstructorOverloading(10);
		new ConstructorOverloading(20.0);
		ConstructorOverloading c1 = new ConstructorOverloading(10,20.0,'A');
		new ConstructorOverloading('A');   
	}
}
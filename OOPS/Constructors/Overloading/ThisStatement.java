class ThisStatement{
	public ThisStatement(){
		this(100);
		System.out.println("This Is Zero Argument Constructor");
	}
	public ThisStatement(int a){
		this(20,40.0,'E');
		System.out.println("This is Integer Constructor: "+a);
	}
	public ThisStatement(double b){
		
		System.out.println("This is double Constructor: "+b);
	}
	public ThisStatement(int c,double d,char e){
		
		System.out.println("This all data Types Constructor");
	}
	public ThisStatement(char e){
		
		System.out.println("This is char Constructor");
	}
	public static void main(String[] args) {
		new ThisStatement();
		//new ThisStatement(20);
		//new ThisStatement(10,20.0,'A');
		//new ThisStatement('B');
	}
}
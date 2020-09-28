class Sample{
	public Sample(int x){
		
		System.out.println("this is this() example "+x);
	}
	public Sample(){
		
		this(10);

		System.out.println("This is Zero argument Constructor");
	}
	public static void main(String[] args) {
		Sample s1 = new Sample();
	}
}
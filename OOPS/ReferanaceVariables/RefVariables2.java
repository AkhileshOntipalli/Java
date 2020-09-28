class RefVariables2{
	int r = 100;
	public static void main(String[] args) {
		
		RefVariables2 r1 = new RefVariables2();
		System.out.println("Value of r = "+r1.r);
		r1.r = 200;
		RefVariables2 r2 = r1;
		System.out.println("Value of r = "+r2.r);
	}
}
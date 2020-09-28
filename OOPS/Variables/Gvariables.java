class GVariables{
	 static int  z1 = 123;
	public void view(){
		int y1 = 24;
		System.out.println("Value of z1 = "+z1);
		System.out.println("Value of y1 = "+y1);
	}
	public static void main(String[] args) {
		new GVariables().view();
		System.out.println("Value of z1 = "+new GVariables().z1);
	}
}
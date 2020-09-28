class Constants{
	final int length =20;
	public void area(int breadth){
		
		double area = length*breadth;
		System.out.println(area);
	}
	public static void main(String[] args) {
		new Constants().area(20);
	}

}
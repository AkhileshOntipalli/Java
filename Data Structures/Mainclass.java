class Mainclass{
	public static void main(String[] args) {
		Object[] ar = new Object[5];
		ar[0]=new Object();
		ar[1]=new Object();
		ar[2]=new Object();
		ar[3]=new Object();
		ar[4]=new Object();

		for (int i=0;i<ar.length;i++ ) {
			int h1 = ar[i].hashCode();
			System.out.println(h1);
		}
		
	}
}
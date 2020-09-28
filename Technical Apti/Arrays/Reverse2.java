class Reverse2{
	public static void main(String[] args) {
		
		int [] a1    = {1,5,7,3,6};
		int [] newa1 = new int[a1.length];
		
		int a=0;

		for (int i=a1.length-1;i>=0;i--) {
			newa1[i]=a1[a++];
		}
		for (int i=0;i<newa1.length;i++ ) {
			System.out.print(newa1[i]+" ");
		}
	}
}
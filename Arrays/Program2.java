class Program2{
	public static void main(String[] args) {
		int [] a1= new int[3];
		a1[0]=11;
		a1[1]=12;
		a1[2]=13;

		System.out.print(a1[1]);

		System.out.println();

		int a2[] = {11,12,13,14,15};
		System.out.print(a2[4]);

		System.out.println();
		
		System.out.println(a1.length);

		System.out.println();

		for (int i=0;i<a1.length;i++ ) {
			System.out.print(a1[i]+" ");
		}
	}
}
class Program{
	public static void time(int [] a1){
		for (int i=0;i<a1.length;i++ ) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for (int j=a1.length-1;j<=a1.length-1;j--) {
			System.out.print(a1[j]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[] a1={1,2,3,4,5,6};
		time(a1);
		
		
		
	}
} 
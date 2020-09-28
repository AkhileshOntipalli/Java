class Duplicate{
	public static void isDupliate(int [] a1){
		int n= a1.length;
		for (int i=0;i<n;i++ ) {
			for (int j=i+1;j<n;j++ ) {
				if (a1[i]==a1[j]) {
					System.out.println(a1[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int a1[] = {1, 1, 2, 1, 3, 1, 5, 3, 2, 6, 2};
		isDupliate(a1);
	}
}
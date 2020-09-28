class Pattern19{
	public static void main(String[] args) {
		int lines = 5;
		for (int i=1;i<=lines;i++ ) {
			for (int j=lines;j>=1;j-- ) {
				if (j!=i) {
					System.out.print(j);
					}else
						System.out.print("*");
				}
			System.out.println();
		}
	}
}
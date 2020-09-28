class Pattern15{
	public static void main(String[] args) {
		int[][] a1 = {{0,0,1,0,0},
					  {0,1,1,1,0},
					  {1,1,1,1,1}};
		int c1 = 1;
		for (int i=0;i<3;i++ ) {
			
			for (int j=0;j<5;j++) {
				if (a1[i][j]==1) {
					System.out.print(c1+++" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
					  	
					  		  
	}
}
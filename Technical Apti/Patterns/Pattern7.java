class Pattern7{
	public static void main(String[] args) {
		int[][] a1 = {{1,0,0},
					  {1,1,0},
					  {1,1,1},
					  {1,1,0},
					  {1,0,0}};
		for (int i=0;i<5;i++ ) {
			for (int j=0;j<3;j++) {
				if (a1[i][j]==1) {
					System.out.print("*"+" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
					  	
					  		  
	}
}
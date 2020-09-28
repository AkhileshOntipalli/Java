class Pattern17{
	public static void main(String[] args) {
		char c1='A';
		char c2='a'; 
		int[][] a1 = {{1,0,0,0},
					  {1,1,0,0},
					  {1,1,1,0},
					  {1,1,1,1}};
		for (int i=0;i<4;i++ ) {
			for (int j=0;j<4;j++ ) {
				if(a1[i][j]==1){
				System.out.print(c1+++" "+c2+++" ");
			}else
			System.out.print(" "+" ");
			}
			System.out.println();
		}			  
	}
}
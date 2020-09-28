class Mindtree2
{
	public static void main(String[] args) 
	{
	  int n = 4;
	  char c1 ='A';
	  char c2 ='a';
	  for (int rows=0;rows<n;rows++ ) 
	  {
	  	for (int col=0;col<=rows;col++ ) 
	  	{
	  	 System.out.print(c1+++""+c2+++" ");	
	  	}
	  	System.out.println();
	  }	
	}
}
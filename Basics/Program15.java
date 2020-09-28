class Program15
{
	
	public static void calcAvg(int[] marks) 
	{
		double sum = 0.0, avg = 0.0;
		for (int index = 0;index < 4 ;index++ )
       {
      	sum = sum+marks[index];
        }
	     sum = sum+marks[0];
	 
	 avg = sum/4;
     System.out.println("Avarage = " +avg);
     } 
     public static void main(String[] args) 
     {
     	int[] marks = new int[4];
	 
	 marks[0] = 47;
	 marks[1] = 42;
	 marks[2] = 51;
	 marks[3] = 40;

      calcAvg(marks);

     }
 }
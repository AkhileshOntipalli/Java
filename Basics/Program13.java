class Program13
{
	public static void main(String[] args) 
	{
	 
	 int[] marks = new int[4];
	 double sum = 0.0, avg = 0.0;

	 marks[0] = 47;
	 marks[1] = 42;
	 marks[2] = 51;
	 marks[3] = 40;

	 sum = sum+marks[0];
	 sum = sum+marks[1];
	 sum = sum+marks[2];
	 sum = sum+marks[3];

	 avg = sum/4;
     System.out.println(avg);
	}
}
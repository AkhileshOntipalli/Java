class Program6
{
	public static void main(String[] args) 
	{
	 int classesattended = 200;
	 int classesheld = 260;
     double percentage = classesattended*100/classesheld;
     System.out.println(percentage);

	 if (percentage >= 75)
     {
	  System.out.println("Attendence percentage is "+percentage+" and student is allowed to sit in exam");
     }
     else
     {
     	System.out.println("The student is not allowed to sit in exam");
     }	
	}
}
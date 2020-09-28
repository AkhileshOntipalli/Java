class Program9
{
	public static void main(String[] args) 
	{
	   int marks = -27;
	   if (marks >=80 && marks <=100) 
	   {
	   	System.out.println("fcd !!!!!!!!! ");
	   }
        else if (marks >=60 && marks<=79)
       {
        System.out.println("first class");	
       }
       else if  (marks >=50 && marks<=59) 
       {
       	System.out.println("second class");
       }
       else if (marks >=30 && marks<=49) 
       {
       	System.out.println("pass");

       }
       else if (marks >=0 && marks <=29) 
       {
       	System.out.println("sorry you are failed..:-");
       }
       else
       {
       	System.out.println("invalid marks");
       }	

	}
}
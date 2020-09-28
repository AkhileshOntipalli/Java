class Program7
{
  public static void main(String[] args) 
  {
	 int classesattended = 180;
	 int classesheld = 260;
     double percentage = classesattended*100/classesheld;
     System.out.println(percentage); 
     if (percentage<75) 
     {
      System.out.println("Do you Have any medical certificate?");
     }

     System.out.println("yes");

     char option = 'Y';
     switch (option)
     {
     case 'Y' : System.out.println("Then you are allowed to sit in exam");
                  break;
     case 'N'  : System.out.println("Then you are not allowed to sit in exam");
                  break;
     default    : System.out.println("Invalid option");  
     }         
  }
}
class Program3
{
 public static void main(String[] args) 
 {
 	int unit = 80;
 	if (unit*10>=1000) 
 	{
 	 System.out.println("your discount is "+(0.1*unit*10)+" and your total cost is "+(unit*10-(0.1*unit*10)));	
 	}
 	else
 	{
 	 System.out.println("No discount");
 	}
 }
}
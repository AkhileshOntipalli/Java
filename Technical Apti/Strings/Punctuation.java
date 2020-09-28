
class Punctuation
{
	public static void main(String[] args) 
	{
	  String  s1	= "Good Morning! Mr. James Potter. Had your breakfast?";
	  int count =0;
	  for (int i=0;i<s1.length();i++) 
	  {
	  	if (s1.charAt(i)=='!'||s1.charAt(i)=='.'||s1.charAt(i)=='?') 
	  	{
	  		count++;
	  	}
	  	
	  }
	  System.out.println(count);
	  	
	}
}	
	  
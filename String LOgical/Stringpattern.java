class Stringpattern
{
	public static void usingArray(String str, String pattern) 
  {

    String[] arr = str.split(" ");
    int repeat = 0;
    int startIndexPos = 0;
    for (int i = 0; i < arr.length; i++) 
    {
     if (pattern.equals(arr[i])) 
     {
        if (startIndexPos <= 0) 
        {
            startIndexPos = i;
        }
        ++repeat;
     }
    }
    System.out.println("Index position " + startIndexPos);

	System.out.println("No of repeatations " + repeat);

  }
  public static void main(String[] args) 
  {
    usingArray("hi how are you how old are you", "how");
  }
}
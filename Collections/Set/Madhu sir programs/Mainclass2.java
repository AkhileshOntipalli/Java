import java.util.TreeSet;

class Mainclass2
{
	public static void main(String[] args) 
	{
	   TreeSet t1 = new TreeSet();
	   t1.add("E");
	   t1.add("A");
	   t1.add("C");
	   t1.add("B");
	   t1.add("A");
	   t1.add("D");

	   for(Object obj : t1)
	   {
	   	System.out.println(obj);
	   }
	}
}







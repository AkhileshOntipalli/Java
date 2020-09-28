import java.util.LinkedList;
class Mainclass
{
	public static void main(String[] args) 
	{
		
		LinkedList l1 = new LinkedList();

		l1.add("hi");
		l1.add("Hello");
		l1.add("GM");
		l1.add("java");

		System.out.println(l1.size());
		System.out.println("---------------------------");
		for (int i=0;i<l1.size();i++ ) 
		{
			System.out.println(l1.get(i));
		}
		System.out.println(l1.size());
        System.out.println("-----------------------------");
        int sz = l1.size();
        System.out.println(l1.size());
        for (int i=0;i<sz;i++) 
        {
        	System.out.println(l1.poll());
        }
        System.out.println("------------------------------");
        System.out.println(l1.size());;

		

	}
}
import java.util.ArrayList;
class Mainclass
{
	public static void main(String[] args) 
	{
	 int []	r1 = new int[4];
	 r1[0] = 10;
	 r1[1] = 20;
	 r1[2] = 30;
	 r1[3] = 40;

     for (int i=0;i<r1.length;i++) 
     {
     	System.out.println(r1[i]);
     }

     ArrayList a1 = new ArrayList();
     a1.add(10);
     a1.add(56.89);
     a1.add("hello");
     a1.add('M');
     a1.add(10);
     a1.add(30);
     for (int i=0;i<a1.size();i++) 
     {
     	
     System.out.println(a1.get(i));
     }

    }

}

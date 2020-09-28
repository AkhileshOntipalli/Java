import java.util.TreeSet;
import java.util.Comparator;
class Student 
{
	int id;
	String name;
	double marks;

	public Student(int id,String name,double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	 @Override
     public String toString()
     {
	   String info = name+" "+id+" "+marks;
	   return info;
      }
}
 class SortByMarks implements Comparator
 {
    @Override
    public int compare(Object obj1,Object obj2)
    {
  	   Student s1 = (Student) obj1;
  	   Student s2 = (Student) obj2;

       int res =(int) (s1.marks - s2.marks);
       return res; 
    }
 }
 


class Mainclass3
{
	public static void main(String[] args) 
	{
		SortByMarks sb2 = new SortByMarks();
		TreeSet t1 = new TreeSet(sb2);

		t1.add(new Student(111,"Miller",456.89));
		t1.add(new Student(333,"David",589.69));
		t1.add(new Student(444,"Smith",418.36));
		t1.add(new Student(222,"Shane",436.89));
        
        for (Object obj :t1 ) 
        {
          System.out.println(obj);	
        }

		
	}
}
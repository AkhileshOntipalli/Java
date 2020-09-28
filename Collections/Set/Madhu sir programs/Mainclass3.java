import java.util.TreeSet;
import java.util.Comparator;

class Student implements Comparable
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
    public int hashCode()
    {
    	return id;
    }

    @Override
    public int compareTo(Object obj)
   {
    int res = this.hashCode() - obj.hashCode();
     return res; 
   }

	@Override
	public String toString()
	{
		String info = name+" "+id+" "+marks;
		return  info;
	}
}


class SortByID implements Comparator
{
  @Override
  public int compare(Object obj1,Object obj2)
  {
    int res = obj2.hashCode() - obj1.hashCode();
    return res; 
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
	   SortByID sb1 = new SortByID();
	   SortByMarks sb2 = new SortByMarks();

	   TreeSet t1 = new TreeSet(sb1);
	   t1.add(new Student(333,"Miller",500));
	   t1.add(new Student(222,"Smith",300));
	   t1.add(new Student(111,"Martin",100));
	   t1.add(new Student(444,"David",200));

	   for(Object obj : t1)
	   {
	   	System.out.println(obj);
	   }
	}
}







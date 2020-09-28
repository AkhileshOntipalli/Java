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
		int res =this.hashCode()-obj.hashCode();
		return res;
	}
	@Override
	public String toString()
	{
		String info = name+" "+id+" "+marks;
		return info;
	}
}
class SortByID implements Comparator
{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		int res = obj1.hashCode()-obj2.hashCode();
		return res;
	}
}
class SortByMarks implements Comparator
{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;

		int res = (int) (s1.marks - s2.marks);
		return res;
	}
}

class Mainclass4
{
	public static void main(String[] args) 
	{
		SortByID sb1 = new SortByID();
		SortByMarks sb2 = new SortByMarks();
		TreeSet t1 = new TreeSet(sb2);

		t1.add(new Student(111,"Yashas",200));
		t1.add(new Student(333,"Srinivas",100));
		t1.add(new Student(222,"Rakesh",600));
		t1.add(new Student(444,"Dora",300));

		for (Object obj :t1) 
		{
			System.out.println(obj);
		}
	}
}
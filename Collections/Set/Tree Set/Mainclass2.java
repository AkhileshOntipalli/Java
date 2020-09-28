import java.util.TreeSet;
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
		int res = this.hashCode()-obj.hashCode();

		return res;
	}
    @Override
	public String toString()
	{
		String info = name+" "+id+" "+marks;
		return info;
	}

}
class Mainclass2
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();

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

import java.util.LinkedHashSet;

class Student
{
	String name;
	int id;
	double marks;
	double perc;

	public Student(String name,int id,double marks)
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public int hashCode()
	{
		return id;
	}

	@Override
	public boolean equals(Object obj)
	{
       if(this.hashCode() == obj.hashCode())
       {
       	  return true;
       }
       else
       {
       	return false;
       }
	}
}

class Mainclass
{
	public static void calcPerc(LinkedHashSet h1)
	{
      for(Object obj : h1)
      {
      	Student std = (Student) obj;

      	std.perc = std.marks/6;

    System.out.println("Perc : "+std.perc+" name: "+std.name+" id : "+std.id);

      }
	}
	public static void main(String[] args) 
	{
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add(new Student("Smith",123,432));
		h1.add(new Student("Allen",234,456));
		h1.add(new Student("Smith",456,432));
		h1.add(new Student("Miller",153,563));
		h1.add(new Student("Smith",123,432));

		calcPerc(h1);

	}
}






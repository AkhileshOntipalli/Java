import java.util.ArrayList;
class Student
{
	int id;
	String name;
	double marks;
	double perc;

	public Student(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
    }
}
class Mainclass2
{
	public static void calcPerc(ArrayList ref)
	{
		for (int i=0;i<ref.size();i++ ) 
	    {
	      Student s1 = (Student) ref.get(i);
	      s1.perc=s1.marks/6;
	      System.out.println("perc ="+s1.perc+" "+"Name ="+s1.name);

	    }
	}
	public static void main(String[] args) 
	{   
		ArrayList slist = new ArrayList();
		slist.add(new Student(2,"Yashas",575));
		slist.add(new Student(4,"Rakesh",585));

		calcPerc(slist);
	}
}	
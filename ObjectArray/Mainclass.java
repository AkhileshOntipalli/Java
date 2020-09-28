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
class Mainclass
{
	public static void calcPerc(Student[] slist)
	{
		for (int i=0;i<slist.length;i++ ) 
	    {
	      slist[i].perc=slist[i].marks/6;
	      System.out.println("name:"+slist[i].name);
	      System.out.println("perc:"+slist[i].perc);
	    }
	}
	public static void main(String[] args) 
	{
		Student[] slist = new Student[3];
		slist[0] = new Student(294,"satya",425.00);
		slist[1] = new Student(288,"yashas",575.00);
		slist[2] = new Student(230,"srinivas",555.00);

		calcPerc(slist);
    }
}	
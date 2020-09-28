class student extends Object
{
	int id;
	String name;
	double marks;

	public student(String name,int id,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;

	}

	
	public String toString()
	{
		String info = name+" "+id+" "+marks;
		return info;
	}
	public int count(int a1)
	{	
		int h1=0;
		h1=h1+a1;
		System.out.println(h1);
		return h1;
	}
}
class Program3{
	public static void main(String[] args) {
	student slist1= new student("Satya",294,565);
	student slist2=new student("Rakesh",274,575);

	slist1.count(1);
	slist2.count(1);

	System.out.println(slist1);
	System.out.println(slist2);
	}
}
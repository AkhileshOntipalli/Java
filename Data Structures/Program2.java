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
		return h1;
	}
}
class Program2
{
	
	public static void main(String[] args) 
	{
		student[] slist=new student[5];
		slist[0]=new student("Satya",294,565).count(1);
		slist[1]=new student("Rakesh",274,575).count(1);
		slist[2]=new student("srinivas",230,555).count(1);
		slist[3]=new student("Yashas",288,515).count(1);
		slist[4]=new student("Dora",221,535).count(1);

		for (int i=0;i<slist.length;i++ ) {
			System.out.println(slist[i]);
		}
	}
}	

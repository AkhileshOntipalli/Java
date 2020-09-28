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
}
class Program
{
	
	public static void main(String[] args) 
	{
		student[] slist=new student[5];
		slist[0]=new student("satya",294,425);
		slist[1]=new student("yashas",288,575);
		slist[2]=new student("srinivas",230,555);
		slist[3]=new student("Rakesh",274,515);
		slist[4]=new student("Dora",221,535);

		for (int i=0;i<slist.length;i++) {
			System.out.println(slist[i]);
		}
	}
}	
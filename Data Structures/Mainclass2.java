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
		
		String info = id+" "+name+" "+marks;
		return info;
	}
}
class Mainclass
{
	public static void calcPerc(String slist)
	{
		for (int i=0;i<slist.length;i++ ) 
	    {
	      slist[i].perc=slist[i].marks/6;
	      System.out.println("perc ="+slist[i].perc+"name ="+slist[i].name);

	    }
	}
	public static void main(String[] args) 
	{
		student[] slist=new student[3];
		slist[0]=new student("satya",294,425);
		slist[1]=new student("yashas",288,575);
		slist[2]=new student("srinivas",230,555);

		int res = calcPerc(slist);

		
		
	}
}	
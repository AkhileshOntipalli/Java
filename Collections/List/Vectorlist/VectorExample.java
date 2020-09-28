import  java.util.*;
class Student{
	String name;
	int id;
	int marks;
	double percentage;
	public Student(String name,int id,int marks){
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public String toString(){
		String info = name+" "+id+" "+marks;
		return info;
	}
}
class VectorExample{
	public static void calcPercentage(Vector ref){
		for (int i=0;i<ref.size();i++ ) {
			Student s = (Student)ref.get(i);
			s.percentage = s.marks/10;
			System.out.println(s.name+" "+s.percentage);
		}
	}
	public static void main(String[] args) {
		Vector vlist = new Vector();
		vlist.add(new Student("Akhil",294,919));
		vlist.add(new Student("Satya",135,974));

		calcPercentage(vlist);
	}
}
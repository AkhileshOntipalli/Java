import java.util.*;
class Student implements Comparable{
	String name;
	int id;
	int marks;
	public Student(String name,int id,int marks){
		this.name=name;
		this.id = id;
		this.marks = marks;
	}
	@Override
	public int hashCode(){
		return marks;

	}
	@Override
	public int compareTo(Object obj){
		int res = this.hashCode()-obj.hashCode();
		return res;
	}
	public String toString(){
		String info = name+" "+id+" "+marks;
		return info;
	}
	
}
class TreeSetExample{
	public static void main(String[] args) {
		TreeSet t1  = new TreeSet();
		t1.add(new Student("Akhilesh",294,919));
		t1.add(new Student("Srinivas",230,924));
		t1.add(new Student("Dora",221,934));
		t1.add(new Student("Yashas",288,975));
		t1.add(new Student("Rakesh",274,856));

		
		for (Object obj : t1 ) {
			System.out.println(obj);
		}
	}
}

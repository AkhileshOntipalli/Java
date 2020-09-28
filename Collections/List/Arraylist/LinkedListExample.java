import java.util.LinkedList;
class Student{
	String name;
	double marks;
	int id;
	double perentage;

	public Student(int id,String name,double marks){
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public String toString(){
		String info = name+" "+id+" "+marks;
		return info;
	}
}
class LinkedListExample{
	public static void calcPercentage(LinkedList ref){
		for (int i=0;i<ref.size();i++) {
			Student s1 = (Student)ref.get(i);
			s1.perentage = s1.marks/10;
			System.out.println(s1.perentage);
		}
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Student(294,"Satya",919));
		l1.add(new Student(288,"Yashas",952));
		l1.add(new Student(274,"Rakesh",888));
		l1.add(new Student(221,"Dora",912));

		calcPercentage(l1);
	}
}
import java.util.*;

class Student{
	String name;
	int id;
	int number_of_books;
	String branch;
	public  Student(String name,int id,int number_of_books,String branch ){
		this.name     			= name;
		this.id       			= id;
		this.number_of_books	= number_of_books;
		this.branch				= branch;
	}
	public void showDetails(){
		System.out.println("Name          	: "+name);
		System.out.println("Id            	: "+id);
		System.out.println("Number_of_Books : "+number_of_books);
		System.out.println("Branch 			: "+branch);		
	}
}
class Library{
	static Student s1 = new Student("Akhilesh",101,2,"EEE");
	public static  void issueBook(){
		System.out.println("Book issued to : "+s1.name);
		s1.number_of_books++;
	}
}
class Composition{
	public static void main(String[] args) {
		Library l1 = new Library();
		
		l1.s1.showDetails();
		l1.issueBook();

	}
}

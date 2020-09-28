import java.util.ArrayList;
class Employee{
	String name;
	int age;
	double salary;
	public Employee(String name,int age,double salary){
		this.name = name;
		this.age  = age;
		this.salary = salary;
	}
}
class ArrayList1{
	public static void processSalary(ArrayList ref){
		for (int i=0;i<ref.size();i++ ) {
			Employee e1 = (Employee)ref.get(i);
			System.out.println("Name = "+e1.name);
			System.out.println("Age = "+e1.age);
			System.out.println("Salary = "+e1.salary);
		}
	}
	public static void main(String[] args) {
		ArrayList emplist  = new ArrayList();
		emplist.add(new Employee("Akhil",23,23000.0));
		emplist.add(new Employee("Durga",24,24000.0));	
		emplist.add(new Employee("Satya",25,25000.0));
		processSalary(emplist);

	}
}	
	

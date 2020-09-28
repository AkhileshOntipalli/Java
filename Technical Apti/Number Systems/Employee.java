class Employee{
	String name;
	int age;
	public Employee(String name,int age){
		this.name = name;
		this.age  = age;
		
	}
	public String toString(){
		String info = name+" "+age;
		return info;
	}
	public static void main(String[] args) {
		Employee e = new Employee("Akhil",23);
		System.out.println(e);
	}
}
class Employee implements Cloneable{
	String name;
	int age;
	String colour;
	public Employee(String name,int age,String colour){
		this.name = name;
		this.age = age;
		this.colour = colour;
	}
	public String toString(){
		String info = name+" "+age+" "+colour;
		return info;
	}
	protected Object clone()throws CloneNotSupportedException{
		Employee emp = new Employee(name,0,colour);
		return emp;
	}
}
class Cloning2{
	public static void main(String[] args) {
		Employee e1 = new Employee("Akhil",23,"black");
		System.out.println(e1);
		System.out.println("HashCode = "+e1.hashCode());
		try{
			Employee e2 = (Employee)e1.clone();
			System.out.println(e2);
			System.out.println("HashCode = "+e2.hashCode());
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
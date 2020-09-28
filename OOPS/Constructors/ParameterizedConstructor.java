class Sample2{
	String name;
	String id;
	double salary;
	public Sample2(String a,String b,double c){
		name   = a;
		id     = b;
		salary = c;
	}
	public void display(){
		System.out.println("Name   : "+name);
		System.out.println("id     : "+id);
		System.out.println("salary : "+salary);
		System.out.println();
	}
}
class ParameterizedConstructor{
	public static void main(String[] args) {
		Sample2 s = new Sample2("Akhilesh","14A31A0294",25000);
		Sample2 s1=new Sample2("Yashas","14A31A0288",40000);
		s.display();
		s1.display();	

	}
}
class Sample1{
	String name;
	long a1;
	int id;
	double z1;
	boolean flag;
	public Sample1(){

	}
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("A1   : "+a1);
		System.out.println("id   : "+id);
		System.out.println("z1   : "+z1);
		System.out.println("flag : "+flag);
	}
}
class ZeroConstructor{
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.display();
	}
}
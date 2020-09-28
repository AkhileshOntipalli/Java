class GrandFather{
	public void display(){
		System.out.println("This is display Method");
	}
	
}
class Father extends GrandFather{
	public void click(){
		System.out.println("This is click Method");
	}
}
class Child extends Father{
	public void count(){
		System.out.println("This is coun Method");
	}
}
class Mainclass{
	public static void main(String[] args) {
		System.out.println("Program Starts =======================");
		System.out.println();
		Father f1  = new Child();//upcatsing
		f1.click();
		f1.display();
		System.out.println();

		GrandFather g1 = new Child();//upcasting
		g1.display();
		System.out.println();

		Child c1 = (Child) f1;
		c1.count();
		c1.click();
		c1.display();
		System.out.println();

		Father f2 = (Father) g1;
		f2.click();
		f2.display();
		System.out.println();

		Child c2 = (Child) g1;
		c2.count();
		c2.click();
		c2.display();
		System.out.println();
		System.out.println("Program Ends ========================");
	}
}
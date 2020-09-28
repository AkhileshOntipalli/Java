class Superclass{
	public void test(int a){
		System.out.println("This is Superclass Test(int a) "+a);
	}
}
class Subclass extends Superclass{
	
	public void test(){
		System.out.println("This is Subclass Test()");
	}
	@Override
	public void test(int a){
	super.test(10);
		//System.out.println("This is Subclass Test(int a)");
	}
}
class MainMethod{
	public static void main(String[] args) {
		/*Superclass s1 = new Superclass();
		s1.test(10);*/
		Subclass s2 = new Subclass();
		//s2.test();
		s2.test(15);
	}
}
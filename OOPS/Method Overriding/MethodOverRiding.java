class Parent{
	public void count(int n){
		for (int i=1;i<n;i++ ) {
			System.out.println(i);
		}
	}
}
class Child extends Parent{
	@Override
	public void count(int n){
		for (int i=n;i>1;i-- ) {
			System.out.println(i);
		}
	}
}
class MethodOverRiding{
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		p.count(5);
		c.count(5);
	}
}
class NonStatic{
	public int id = 23;
	public void test(){
		int a =10,b=20,c=a+b;
		System.out.println(c);
	}
	public void display() {
				System.out.println(id);
				test();

	}
	public static void main(String[] args) {
		new NonStatic().display();
		
	}
	
}
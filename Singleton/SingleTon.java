class Demo{
	static Demo ref = null;
	private Demo(){
		System.out.println("object created");
	} 
	public static Demo getObject(){
		if (ref==null) {
			ref = new Demo();
		}
		return ref;
	}
}
class SingleTon{
	public static void main(String[] args) {
		Demo d1 = Demo.getObject();
		System.out.println("d1 = "+d1);
		Demo d2 = Demo.getObject();
		System.out.println("d2 = "+d2);
	}
}
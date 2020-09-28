class Count{
	static int value=0;
	static Count ref = null;
	private Count(){
		System.out.println("Object Created");
	}
	public static Count getObject(){
		if (ref==null) {
			ref = new Count();
		}
		return ref;
	}
	public void increment(){
		value++;
	}
	public void decrement(){
		value--;
	}
	public void showValue(){
		System.out.println("Value = "+value);
	}
}
class SingleTon2{
	public static void main(String[] args) {
		Runnable r1 = ()->{
			Count c1 = Count.getObject();
			c1.increment();
			c1.showValue();
		};
		Runnable r2 = ()->{
			Count c2 = Count.getObject();
			c2.increment();
			c2.showValue();
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
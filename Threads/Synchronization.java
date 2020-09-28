class Count{
	static int value = 1;
	public synchronized void increment(){
		value++;
	}
	public void decrement(){
		value--;
	}
	public synchronized void showValue(){
		System.out.println("Value = "+value);
	}
}
class Synchronization{
	public static void main(String[] args) {
		Count c1 = new Count();
		Runnable r1 = ()->{
			c1.increment();
			c1.showValue();
		};
		Runnable r2 = ()->{
			c1.decrement();
			c1.showValue();
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
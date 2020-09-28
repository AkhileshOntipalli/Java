class Priority{
	public static void main(String[] args) {
		Runnable r1 = ()->{
			System.out.println("Executing Task One");
		};
		Runnable r2 = ()->{
			System.out.println("Executing Task Two");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		int priority1 = t1.getPriority();
		System.out.println("priority1 = "+priority1);
		int priority2 = t2.getPriority();
		System.out.println("priority2 = "+priority2);

		t2.setPriority(10.0);
		t1.start();
		t2.start();
	}
}
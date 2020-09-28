class SBlock{
	static String s1 = new String("Hi");
	public static void main(String[] args) {
		Runnable r1  = ()->{
			System.out.println("t1 is waiting to lock s1");
			synchronized(s1){
				System.out.println("t1 locked to s1");
				s1 +="Java";
				System.out.println("s1 = "+s1);
			}
			System.out.println("t1 realesed lock on s1");
		};
		Runnable r2 = ()->{
			System.out.println("t2 is waiting to lock s1");
			synchronized(s1){
				System.out.println("t2 locked to s1");
				s1 +=" Hello";
				System.out.println("s1 = "+s1);
			}
			System.out.println("t2 realesed lock on s1");
		};
		Runnable r3 =()->{
			System.out.println("t3 is waiting to lock s1");
			synchronized(s1){
				System.out.println("t3 locked to s1");
				s1 +=" World";
				System.out.println("s1 = "+s1);
			}
			System.out.println("t3 Released lock on s1");
		};
		Thread t1  = new Thread(r1);
		Thread t2  = new Thread(r2);
		Thread t3  = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();
	}
}
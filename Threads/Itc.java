class Itc{
	static String s1 = new String("HI");
	static String s2 = new String("Hello");
		public static void main(String[] args) {
			Runnable r1 = ()->{
				System.out.println("T1 is waiting to lock s1");
				synchronized(s1){
					System.out.println("T1 locked to s1");
					System.out.println("T1 is waiting to lock s2 ");
					synchronized(s2){
						System.out.println("T1 locked to s2");
						System.out.println("T1 Released lock on s2");
					}
				}
				System.out.println("T1 Released lock on s1");
			};
			Runnable r2 = ()->{
				System.out.println("T2 is waiting to lock s2");
				synchronized(s2){
						System.out.println("T2 locked on s1");
						System.out.println("T2 is waiting to lock on s2");
					synchronized(s1){
						System.out.println("T2 locked s2");
						System.out.println("T2 Released lock on s2");
					}
				}
				System.out.println("T2 Released lock on s1");
			};
			Thread t1 =  new Thread(r1);
			Thread t2 =  new Thread(r2);
			t1.start();
			t2.start();
	}
}
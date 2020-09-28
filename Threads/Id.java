class Id{
	public static void main(String[] args) {
		Runnable r1 = ()->{
			System.out.println("Executing TaksOne");
		};
		Runnable r2 = ()->{
			System.out.println("Executing Tasktwo");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		long t1Id = t1.getId();
		System.out.println("t1ID = "+t1Id);
		long t2Id = t2.getId();
		System.out.println("t2ID = "+t2Id);

	}
}
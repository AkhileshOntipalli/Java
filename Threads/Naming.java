class Naming{
	public static void main(String[] args) {
		Runnable r1 = ()->{
			System.out.println("Executing TaskOne");
		};
		Runnable r2 = ()->{
			System.out.println("Executing TaskTwo");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		String t1Name = t1.getName();
		System.out.println("t1Name = "+t1Name);
		String t2Name = t2.getName();
		System.out.println("t2Name = "+t2Name);

		t1.setName("TaskOne");
		String t3Name = t1.getName();
		System.out.println("t3Name = "+t3Name);

		t2.setName("TaskTwo");
		String t4Name = t2.getName();
		System.out.println("t4Name = "+t4Name);  
	}
}
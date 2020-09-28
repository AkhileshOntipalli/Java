class Threading2{
	public static void main(String[] args) {
		Runnable r1 = ()->{
			System.out.println("Execting TaskOne");
		};
		Runnable r2 =()->{
			System.out.println("Executing TaskTwo");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
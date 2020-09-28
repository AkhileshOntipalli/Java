class ThreadingExample extends Thread{
	public  void run(){
		System.out.println("Hii....");
	}
}
class ThreadingExample2 extends ThreadingExample{
	public void run(){
		System.out.println("Hello.....");
	}
}
class ThreadCreationClass{
	public static void main(String[] args) {
		ThreadingExample t1 = new ThreadingExample();
		ThreadingExample2 t2 = new ThreadingExample2();

		t1.start();
		t2.start();
	}
}
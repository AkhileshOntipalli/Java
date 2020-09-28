class Threading implements Runnable{
	public void run(){
			for (int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+" in Control");
			}
	}
}
class YeildDemo{
	public static void main(String[] args) {
		Threading t = new Threading();
		Thread r = new Thread(t);
		r.start();
		for (int i=0;i<5;i++ ) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+" in Control");
		}
		

	}
}
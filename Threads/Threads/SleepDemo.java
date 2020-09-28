class Threading implements Runnable{
	public void run(){
			for (int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+" in Control"+" "+i);
				try{
					Thread.sleep(5000);
				}
				catch(Exception e){
					System.out.println(e);
				}
				
			}
	}
}
class SleepDemo{
	public static void main(String[] args) {
		Threading t = new Threading();
		Threading t2 = new Threading();
		
		Thread r = new Thread(t);
		r.start();
		
		Thread r2 = new Thread(t2);
		r2.start();
		
		

	}
}
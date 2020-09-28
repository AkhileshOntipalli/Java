class Threading implements Runnable{
	public void run(){
			Thread t = Thread.currentThread();
			System.out.println("Current Thread : "+t.getName());
			System.out.println("Is Alive? :"+t.isAlive());
	}
}
class JoinDemo{
	public static void main(String[] args) throws InterruptedException {
		Threading t = new Threading();
		Thread r = new Thread(t);
		r.start();
		r.join(5000);
		Thread r2 = new Thread(new Threading());
		r2.start();
		
		System.out.println("\nJoining after 5000"+ 
                             " mili seconds: \n"); 
        System.out.println("Current thread: " + 
                                    r.getName()); 
  		System.out.println("Is alive? " + r.isAlive()); 
	}
}
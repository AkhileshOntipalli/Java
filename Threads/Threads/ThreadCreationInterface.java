class ThreadExample implements Runnable{
	public  void run(){
		System.out.println("Thread "+Thread.currentThread().getId()+" is Running");
	}
}

class ThreadCreationInterface{
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		
		for (int i=1;i<9;i++ ){
			Thread r1 = new Thread(t1);
			r1.start();
		}
	}
}
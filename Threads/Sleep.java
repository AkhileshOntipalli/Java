class Sleep{
	public static void main(String[] args) {
		Runnable r1 = ()->{
			for(int i=1;i<3;i++){
				System.out.println("Executing Task One");
			}
		};
		Runnable r2 = ()->{
			try{
				Thread.sleep(500);
				for (int j=1;j<3;j++ ) {
				System.out.println("Executing Task Two");
			}
		}catch(InterruptedException e){

		}	
		};
		Runnable r3 = ()->{
			try{
				Thread.sleep(1000);
				for (int k=1;k<3;k++ ) {
				System.out.println("Executing Task Three");
			}
		}catch(InterruptedException ie){

		}	
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();
	}
}
		
	

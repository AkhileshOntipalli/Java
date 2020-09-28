class DeamonThread extends Thread{
	public DeamonThread(String name){
		super(name);
	}
	public void run(){
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" "+"is Deamon Thread");	
		}
		else {
			System.out.println(getName()+" "+"is User Thread");
		}
	}
	public static void main(String[] args) {
		DeamonThread d1 = new DeamonThread("d1");
		DeamonThread d2 = new DeamonThread("d2");
		DeamonThread d3 = new DeamonThread("d3");

		d1.setDaemon(true);
		d1.start();

		d2.start();

		d3.setDaemon(true);
		d3.start();
	}
}
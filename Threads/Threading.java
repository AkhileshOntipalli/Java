class ThreadOne extends Thread{
	@Override
	public void run(){
		int a=10;int b=20;int c;
		c = a+b;
		System.out.println("C = "+c);
		System.out.println("Executing Taskone");
	}
}
class ThreadTwo extends Thread{
	@Override
	public void run(){
		int a=80;int b = 120;int s;
		s = a+b;
		System.out.println("S = "+s);
		System.out.println("Executing Tasktwo");
	}
}
class Threading{
	public static void main(String[] args) {
		System.out.println("Program Starts");
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();

		t1.start();
		t2.start();
		System.out.println("Program Ends");
	}
}
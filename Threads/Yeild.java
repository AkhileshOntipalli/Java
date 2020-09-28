import java.lang.*;
class Yeild{
	public static void main(String[] args) {
		Runnable r1 = ()->
		{
			Thread.yield();
			for (int i=1;i<3;i++) {
				System.out.println(i+" Executing task one");
			}
		};
		Runnable r2 = ()->{
			for (int j=1;j<3;j++) {
				System.out.println(j+" Executing task Two");
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
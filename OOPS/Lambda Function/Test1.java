interface Run{
	public int display(int a,int b);
}
class Test1{
	public static void main(String[] args) {
		Run r =(int a, int b)->{
			int c= a+b;
			return c;
		};
		int res = r.display(10,20);
		System.out.println(res);
	}
}
class Generic{
	public static void test(int n){
		int a1[] = {10,20,30};
		String s1 =new String("Hello");
		Object o = s1;//upcasting
		try{System.out.println(a1[0]/n);
			System.out.println(a1[n]);
		StringBuffer sb = (StringBuffer)o;}
		catch(ClassCastException e){
			System.out.println("DOWN CASTING");
		}
	}	
	public static void main(String[] args) {
		test(2);
	}
		
}
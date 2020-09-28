class Repeated{
	public static String repeat(String s1, String s2){
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		String out = " ";
		for (int i=0;i<c1.length;i++) {
			int count = 0;
			for (int j=0;j<c2.length;j++) 
			{
				if (c1[i]==c2[j]) 
				{
					++count;
				}
			}
			if (count==0) {
				out=out+c1[i];
			}
		}
		return out;
	}
	public static void main(String[] args) {
		String res = repeat("COMPUTER","PROGRAM");
		System.out.println(res);
	}
}
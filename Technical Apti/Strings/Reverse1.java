class Reverse1{
	public static String reveachword(String s1){
		char[] c1 = s1.toCharArray();
		String out = " ";
		for (int i=0;i<c1.length;i++) {
			String res =" ";
			while(i<c1.length && c1[i]!=' ')
			{
				res = c1[i]+res;
				i++;
			}
			out = out+" "+res;
		}
		return out;
	}
	public static void main(String[] args) {
		String s2=reveachword("JAVA IS EASY");
		System.out.println(s2);
	}
}
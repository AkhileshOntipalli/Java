class Reverse2{
	public static void main(String[] args) {
		String s1="JAVA IS EASY";
		char[] c1 = s1.toCharArray();
		String out = " ";
		for (int i=0;i<c1.length;i++) {
			String res =" ";
			while(i<c1.length && c1[i]!=' '){
				res = c1[i]+res;
				i++;
			}
			out = out+" "+res;
		}
		System.out.println(out);
	}
}
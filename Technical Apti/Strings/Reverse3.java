class Reverse3{
	public static String reversewholestring(String s1){
		char[] c1 = s1.toCharArray();
		String out = " ";
		for (int i=0;i<c1.length;i++ ) {
			String res = " ";
			while (i<c1.length&&c1[i]!=' ') {
				res = res+c1[i];
				i++;
			}
			out = res+res.length()+out;
		}
		return out;
	}
	public static void main(String[] args) {
		String out = reversewholestring("JAVA IS EASY");
		System.out.println(out);
	}

}
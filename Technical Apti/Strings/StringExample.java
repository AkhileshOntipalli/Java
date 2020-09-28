class StringExample{
	public static String firstHalf(String str){
		int mid=str.length()-1/2;
		String res = " ";
		for (int i=0;i<mid;i++) {
			res +=str.charAt(i);
			System.out.println(res);
			System.out.println(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String s1 = new String("aaaaaabbbbbbbbbbbbb");
		firstHalf(s1);
	}
}
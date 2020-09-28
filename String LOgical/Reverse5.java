class Reverse5{
	public static void isReverse(String s1){
		//char[] charArray = new char[s1.length()];
		//int index = 0;
		String res = "";
		for(int i=s1.length()-1;i>=0;i--){
			res = s1.charAt(i)+res;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		String s1 = "satya durga akhilesh";
		isReverse(s1);
	}
}
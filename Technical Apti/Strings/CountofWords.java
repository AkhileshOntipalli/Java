class CountofWords{
	public static int counter(String s1){
	    int count =1;
		if (s1.charAt(0)==' ') 
		{
			count = 0;
		}
		for (int i=0;i<s1.length()-1;i++) {
			if (s1.charAt(i)==' '&& s1.charAt(i+1)!=' ') 
			{
				count++;
			}

		}
		return count;
	}
	public static void main(String[] args) {
		String s1 = "java is easy";
		int result = counter(s1);
		System.out.println(result);
	}
}
class Vowels{
	public static void main(String[] args) {
		int vowels =0;
		int consonants = 0;
		String s1 = "This is a really simple sentence";
		s1=s1.toLowerCase();
		for (int i=0;i<s1.length();i++) {
			if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				vowels++;
				
			}
			else if(s1.charAt(i)!=' ')
			{
				consonants++;
				
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);

	}
}
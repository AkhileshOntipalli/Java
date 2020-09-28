class StringRepeated{
	public static void main(String[] args) {
		String s1 = "how cow now now how cow cow now now now how how";
		String[] words =s1.split(" ");
		String pattern = "now";
		int repeat=0;
		for (int i = 0; i<words.length; i++) {
				if (pattern.equals(words[i])) {
					++repeat;
				}
		}
		System.out.println(pattern +" is repeated for "+repeat+" times");
	}
}
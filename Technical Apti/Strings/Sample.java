class Sample{
	public static void main(String[] args) {
		String s1 = new String("Akhilesh");
		String s2 = "Akhilesh";
		String s3 =new String("Akhilesh");
		String s4 ="Akhilesh";
		String s5 =" Ontipalli";
		String s6 =s2+s5;
		String s7 ="Akhilesh"+s5;
		String s8 = "Akhilesh"+" Ontipalli";
		String s9 ="Akhilesh Ontipalli";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s6==s7);
		System.out.println(s8==s9);
	}
}
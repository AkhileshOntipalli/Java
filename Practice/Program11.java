class Program11{
	public static String reverse(String s1){
		char [] c1=s1.toCharArray();
		String out=" ";
		for (int i=0;i<c1.length;i++) {
			String res=" ";
            while (i<c1.length && c1[i]!=' ') {
            	res =c1[i]+res;
            	i++;
            }
            out = out+" "+res;
		}
		return out;
	}
	public static void main(String[] args) {
		String out = reverse("This Is A JAVA Progaram");
		System.out.println(out);
	}
}
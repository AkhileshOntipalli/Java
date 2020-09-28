class MostRepeated{
	public static void main(String[] args) {
		String s1 = "SATYA DURGA AKHILESH";
		int[] a1 = new int[s1.length()];
		char maximum = s1.charAt(0);
		char minimum = s1.charAt(0);

		int min,max;

		char[] c1 = s1.toCharArray();

		for (int i=0;i<c1.length;i++) {
				a1[i]=1;
				for (int j=i+1;j<c1.length;j++) {
					if (c1[i]==c1[j] && c1[i]!=' ' && c1[i]!='0') {
						a1[i]++;
						c1[j]='0';
					}
				}
			}
			min=a1[0];
			max=a1[0];
			for (int i=0;i<a1.length;i++ ) {
					if (min>a1[i] && a1[i]!='0') {
						min=a1[i];
						minimum = c1[i];
                    }
					if (max<a1[i]) {
							max=a1[i];
							maximum=c1[i];
					}	
					
				}
				System.out.println("Less Repeated Character :"+ minimum);
				System.out.println("Most Repeated Character :"+ maximum);	
	}
}
class RepeatedLetters{
	public static void isRepeated(String s1){
		char c1[] = s1.toCharArray();
		int n=c1.length;
		for (int i=0;i<n;i++) {
			int count = 1;
			for (int j=i+1;j<n;j++) {
				if (c1[i]==c1[j]&&c1[i]!=' '&&c1[j]!=' ') {
					count++;
					int k=j;
					while (k<n-1) {
						c1[k]=c1[k+1];
						k++;
					}
					n--;
					j--;
				}
			}
			if (count !=0) {
				System.out.println(c1[i]+" is repeated for "+count+" times");	
			}
		}
	}
	public static void main(String[] args) {
		String s1="SaTyA DuRgA aKhIlEsH";
		s1=s1.toLowerCase();
		isRepeated(s1);
	}
}
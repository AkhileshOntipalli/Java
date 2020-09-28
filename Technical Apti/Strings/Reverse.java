class Reverse{
	public static String rev(String a1){
         char c1[] = a1.toCharArray();
         String out = " ";
         for (int i=c1.length-1;i>=0;i--) {
              out=out+c1[i];
         	
         }
         return out;
			
		}
		public static String rev1(String a1) {
			char c1[] = a1.toCharArray();
			for (int i=0;i<c1.length/2;i++) {
				char temp=c1[i];
				c1[i]=c1[c1.length-1-i];
				c1[c1.length-1-i] =temp;
            }
            return new String(c1);
		}
		public static void main(String[] args) {
			String a1 = "Satya";
			String res = rev1(a1);
			System.out.println(res);
		}
	}

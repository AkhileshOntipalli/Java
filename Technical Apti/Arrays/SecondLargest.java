class SecondLargest{
	public static void main(String[] args) {
		int [] a1 = {10,20,40,0,90,50,60,100,120};
		int max = 0;
		int smax = 0;
		for (int i=0;i<a1.length;i++ ) {
			if(a1[i]>max){
				smax = max;
				max = a1[i];
			}
			else if (a1[i] > smax) {
				smax = a1[i];
			}
		}
		System.out.println(smax);
		System.out.println(max);
	}
}
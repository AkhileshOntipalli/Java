 class MinimumElement{
	public static void main(String[] args) {
		int a1[] = {1,60,-10,70,-80,85};
		int minimum=0;
		int element1=0;
		int element2=0;
		for (int i=0;i<a1.length;i++) {
			for (int j=i+1;j<a1.length;j++ ) {
				int res = a1[i]-a1[j];
				if (res<minimum) {
					minimum =res;
					element1=a1[i];
					element2=a1[j];
				}
			}
		}
		System.out.println(element1+" "+element2);
	}
}
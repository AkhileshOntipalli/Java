class PerfectNumberRange{
	public static boolean isPerfect(int number){
		int sum=0;
		for (int i=1;i<=number/2;i++ ) {
			if (number%i==0) {
				sum+=i;
			}
		}
		return (sum==number);
	}
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for (int i=1;i<100000;i++) {
			if (isPerfect(i)) {
				System.out.println(i);
				//count++
				//sum+=i;
			}
		}
		//System.out.println("There are "+count+" numbers between 1 to 100000 ");
		//System.out.println(sum);
	}
}
class PrimeNumberRange{
	public static boolean isPrime(int number){
		if (number<=1){
			return false;
		} 
		for (int i=2;i<=number/2;i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//int count = 0;
		//int sum=0;
		for (int i=0;i<1000;i++ ) {
			if (isPrime(i)) {
					System.out.println(i);
					//sum+=i;
					//count++;				
			}
		}
		//System.out.println("There are "+count+" numbers between 1 to 10");
		//System.out.println("sum of first 10 Prime Numbers = "+sum);
	}
}
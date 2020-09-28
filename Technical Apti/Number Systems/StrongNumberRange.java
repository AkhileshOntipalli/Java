class StrongNumberRange{
	public static boolean isStrong(int num){
		int output=0,remainder,temp;
		temp=num;
		while(num>0){
			remainder = num%10;
			int factorial = 1;
			for (int i=remainder;i>1;i--) {
				factorial = factorial *i;
			}
			output = output+factorial;
			num=num/10;
		}
		if (temp!=output) {
			return false;
		}
		else 
			return true;
	}
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i=1;i<100000;i++) {
			if (isStrong(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("There are "+count+" strong numbers between 1 to 1lakh");
	}
}
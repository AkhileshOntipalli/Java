class StrongNumber{
	public static boolean isStrong(int num){
		int output=0,remainder,temp;
		temp=num;
		while(num>0){
			remainder = num%10;
			int factorial=1;
			for (int i=remainder;i>1;i-- ) {
				factorial = factorial*i;
			}
			output = output+factorial;
			num = num/10;
		}
		if (temp==output) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
			if(isStrong(145)){
				System.out.println("Strong Number");
			}
			else
			System.out.println("Not Strong Number");
	}
}
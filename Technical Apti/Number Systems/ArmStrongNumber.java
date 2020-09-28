class ArmStrongNumber{
	public static int power(int remainder,int count){
		int power=1;
		for (int i=0;i<count;i++) {
			power = power*remainder;
		}
		return power;
	}
	public static boolean isArmStrong(int num){
		int output=0,temp,remainder;
		temp=num;
		int temp2=num;
		int count=0;
		while(temp2>0){
			temp2=temp2/10;
			count++;
		} 
		while (num>0) {
			remainder=num%10;
			output=power(remainder,count)+output;
			num=num/10;
		}
		if (temp==output) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		if (isArmStrong(153)) {
			System.out.println("ArmStrong Number");
		}
		else
			System.out.println("Not ArmStrong Number");
	}
}
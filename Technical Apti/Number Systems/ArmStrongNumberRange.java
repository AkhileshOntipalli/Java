class ArmStrongNumberRange{
	public static int power(int remainder,int count){
		int power = 1;
		for (int i=0;i<count;i++) {
			power *=remainder; 
		}
		return power;
	}
	public static boolean isArmStrong(int num){
		int temp=num,temp2=num,output=0,remainder,count=0;
		while (temp2>0) {
			temp2/=10;
			count++;
		}
		while (num>0) {
			remainder=num%10;
			output+=power(remainder,count);
			num/=10;
		}
		if(temp==output){
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		for (int i=1;i<100000;i++ ) {
			if (isArmStrong(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
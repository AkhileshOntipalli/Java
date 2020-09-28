class Lcm{
	public static int calculateLcm(int num1,int num2){
		int temp,res,i=2;
		if (num1>num2) {
			res = num1;
		}
		else
			res = num2;
			temp= res;
		while (res%num1!=0||res%num2!=0) {
			res = temp*i;
			i++;
		}
		return res;
	}
	public static void main(String[] args) {
		int [] array = {4,8,12,16};
		int lcm = calculateLcm(array[0],array[1]);
		for (int i=2;i<array.length;i++ ) {
			lcm = calculateLcm(lcm,array[i]);
		}
		System.out.println(lcm  \);
	}
}
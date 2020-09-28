import java.util.Scanner;
class PerfectNumber{
	public static boolean isPerfect(int number){
		int sum=0;
		for (int i=1;i<=number/2;i++) {
			if (number%i==0) {
				sum+=i;
			}
		}
		return(number==sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		if (isPerfect(number)) {
			System.out.println(number+" is A Perfect Number");
		}else
		System.out.println(number+"is Not a Perfect Number");
	}
}
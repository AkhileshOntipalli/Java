
import java.util.Scanner;

public class ClosestGift{
	public static boolean checkPrime(long n) {
		for(long i = 2; i<Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		long  j;
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		if(checkPrime(number)) {
			System.out.println("2");
		} else {
			for(long i = 1; i < number - 2; i++) {
				if(checkPrime(number - i)) {
					System.out.println((int)(number - (number - i)));
					break;
				} else if(checkPrime(number + i)) {
					System.out.println((int)((number + i) - number));
					break;
				}
			}
		}
	}

	 
}
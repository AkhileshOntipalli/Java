class Account{
	private int accountNo = 1234;
	private double balance = 520.5;
	public double getBalnce(int accountNo){
		if (this.accountNo==accountNo) {
			return balance;
		}
		else{
			String msg ="Invalid Account Number";
			IllegalArgumentException ie = new IllegalArgumentException(msg);
			throw ie;
			//System.out.println("Hello");
		}
	}
}
class Throw{
	public static void main(String[] args) {
		Account a1  = new Account();
		double b = a1.getBalnce(1234);
		System.out.println("Balance = "+b);
	}
}
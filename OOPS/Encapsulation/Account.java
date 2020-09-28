class Account{
	private long accountno = 9652269037l;
	private double bal;
	public void setBal(double amount){
		if(amount>0){
			bal = bal+amount;
		}
		else{
			System.out.println("Invalid Amount");
		}
	}
	public double getBal(long accountno){
		if (accountno == 9652269037l) {
			return bal;	
		}
		else{
			return -777;
		}
	}
	public long showAccount(int pin){
		if(pin==2010){
			return accountno;
		}
		else{
			return -777;
		}
	}
	public static void main(String[] args) {
		Account a  = new Account();
		System.out.println();
		System.out.println("For Valid Value==================");
		a.setBal(2000.0);
		double d1 =a.getBal(9652269037L);
		System.out.println("Balance = "+d1);
		long i= a.showAccount(2010);
		System.out.println("Account No = "+i);
		System.out.println();
		System.out.println("For Invalid Value================");
		a.setBal(-2000.0);
		double d2 = a.getBal(12345);
		System.out.println("Balance = "+d2);
		long j = a.showAccount(12345);
		System.out.println("Account No = "+j);
	}
}
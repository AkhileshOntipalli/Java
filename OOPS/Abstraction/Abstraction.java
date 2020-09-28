interface Account{
	public void deposit();
	public void withdraw();
}
class SavingsAccount implements Account{
	@Override
	public void deposit(){
		System.out.println("Money deposited to Savings Account");
	}
	@Override
	public void withdraw(){
		System.out.println("Money withdrawed from Savings Account");
	}
}
class FixedDeposit implements Account{
	@Override
	public void deposit(){
		System.out.println("Money deposited to FixedDeposit Account");
	}
	@Override
	public void withdraw(){
		System.out.println("Money withdrawed from FixedDeposit Account");
	}
}
class AccountManager{
	public static Account createAccount(char type){
		Account a1;
		if(type=='S'){
			a1 = new SavingsAccount();
			return a1;
		}
		else
			a1=new FixedDeposit();
			return a1;
	}
}
class Abstraction{
	public static void main(String[] args) {
		Account a1 = AccountManager.createAccount('l');
		a1.deposit();
		a1.withdraw();
	}
}
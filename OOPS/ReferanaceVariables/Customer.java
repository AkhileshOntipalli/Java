class Account{
	int accountNo = 58049635;
	String name    = "Akhilesh";
	String branch  = "Veera Bhadra Puram";
	double balance = 5000.00;
	String accounttype = "Savings";
	static String bank = "ANDHRA BANK";

	public void showAccountDetails(){
		System.out.println("Bank : "+bank);
		System.out.println("Account number : "+accountNo);
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("Account Type : "+accounttype);
	}
	public void deposit(int amount){
		balance +=amount;
	}
	public void withdraw(int amount){
		balance -=amount;
	}
	public void checkBalance(){
		System.out.println("Available Balance = "+balance);
	}
   
}
class Customer{
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.showAccountDetails();
		System.out.println();
		a1.checkBalance();
		System.out.println();
		a1.deposit(2000);
		a1.checkBalance();
		System.out.println();
		a1.withdraw(5000);
		a1.checkBalance();
		System.out.println();
		
	}
}
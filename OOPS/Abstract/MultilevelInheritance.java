abstract class Account{
	public void createAccount(){
		System.out.println("Account is created");
	}
	abstract public void getAcctStmt();
}
class Savings extends Account{
	@Override
	public void getAcctStmt(){
		System.out.println("Statement of Savings Account");
	}
}
class Loan extends Account{
	@Override
	public void getAcctStmt(){
		System.out.println("Statement of Loan Account");
	}
}
class FixedDeposit extends Account{
	@Override
	public void getAcctStmt(){
		System.out.println("Statement of Fixed Deposit Account");
	}
}
class MultilevelInheritance{
	public static void main(String[] args) {
		Savings s1 = new Savings();
		s1.createAccount();
		s1.getAcctStmt();

		Loan l1 = new Loan();
		l1.createAccount();
		l1.getAcctStmt();

		FixedDeposit f1  =new FixedDeposit();
		f1.createAccount();
		f1.getAcctStmt();
	}
}
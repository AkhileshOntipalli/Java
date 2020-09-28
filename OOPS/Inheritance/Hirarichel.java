class Account{
	String name = "Akhilesh";
	long number = 9652269037l;
	String branch = "Paper Mill";
	public void showAccountDetails(){
		System.out.println("Name = "+name);
		System.out.println("Number = "+number);
		System.out.println("Branch = "+branch);
	} 
}
class SavingsAccount extends Account{
	public void showSavings(){
		System.out.println("This is Savings Account");
	}
}
class LoanAccount extends Account{
	public void showLoan(){
		System.out.println("This is Laon Account");
	}
}
class Hirarichel{
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.showAccountDetails();
		s.showSavings();

		LoanAccount l  = new LoanAccount();
		l.showAccountDetails();
		l.showLoan();

	}
}
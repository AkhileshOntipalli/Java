interface Card{
	public void makePayment();
}
class Debit implements Card{
	@Override
	public void makePayment(){
		System.out.println("Debit Card Payment");
	}
}
class Credit  implements Card {  

	@Override
	public void makePayment(){
		System.out.println("Credit Card Payment");
	}
}
class  SwipeMachine{
	public static void swipe(Credit e){
		e.makePayment();
	}
}
class Runtime{
	public static void main(String[] args) {


		Credit c = new Credit();
		SwipeMachine.swipe(c);

		Debit d = new Debit();
		SwipeMachine.swipe(d);
	}
}
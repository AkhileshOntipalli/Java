class WhatsApp1{
	public void message(){
		System.out.println("This is text message");
	}
}
class WhatsApp2 extends WhatsApp1{
	public void voice(){
		System.out.println("This Is voice Message");
	}
}
class WhatsApp3 extends WhatsApp2{
	public void video(){
		System.out.println("This is video Message");
	}
}
class MultiLevel{
	public static void main(String[] args) {
		WhatsApp3 w = new WhatsApp3();
		w.message();
		w.voice();
		w.video();
	}
}
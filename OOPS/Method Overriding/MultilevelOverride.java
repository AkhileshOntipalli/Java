class WhatsAppV1{
	
	public void sentReport(){
		System.out.println("Show One Black Tick");
	}
}
class WhatsAppV2 extends WhatsAppV1{
	@Override
	public void sentReport(){
		System.out.println("Show Two Black Tick");
	}
}
class WhatsAppV3 extends WhatsAppV2{
	@Override
	public void sentReport(){
		System.out.println("Show Blue Ticks");
	}
}
class MultilevelOverride{
	public static void main(String[] args) {
		WhatsAppV1 w1 = new WhatsAppV1();
		w1.sentReport();
		WhatsAppV2 w2 = new WhatsAppV2();
		w2.sentReport();
		WhatsAppV3 w = new WhatsAppV3();
		w.sentReport();
	}
}
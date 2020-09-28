interface Port{
	 public void connect();
}
class Mouse implements Port{
	@Override
	public void click(){
		System.out.println("Clicking");
	}
	@Override
	public void scroll(){
		System.out.println("Scrolling");
	}
}
class Pendrive implements Port{
	@Override
	public void read(){
		System.out.println("Read");
	}
	@Override
	public void write(){
		System.out.println("Write");
	}
}
class UsbPort{
	public static void usb(Port a){
		a.connect();
	}
}
class Mainclass2{
	public static void main(String[] args) {
		Pendrive p = new Pendrive();
		UsbPort.usb(p);

		Mouse m = new Mouse();
		UsbPort.usb(m);
	}
}
class Mouse{
	public void click(){
		System.out.println("Mouse port");
	}
}
class Pendrive{
	public void read(){
		System.out.println("Readable Pendrive");
	}
	public void write(){
		System.out.println("Writeable Pendrive");
	}
}
class UsbPort{
	public static void connect(Object args) {
		if (args instanceof Mouse) {
			Mouse m1 = (Mouse) args;
			m1.click();
		}
		else{
			Pendrive p1 = (Pendrive) args;
			p1.read();
			p1.write();
		}
			
	}
}
class Down{
	public static void main(String[] args) {
		Mouse m = new Mouse();
		UsbPort.connect(m);

		Pendrive p = new Pendrive();
		UsbPort.connect(p);
	}
}
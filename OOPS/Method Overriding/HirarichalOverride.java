class AndroidOs{
	public void showHomeScreen(){
		System.out.println("Show 5 Icons");
	}
}
class SamsungOs extends AndroidOs{
	public void showHomeScreen(){
		System.out.println("Show Two Icons");
	}
}
class RedmiOs extends AndroidOs{
	public void showHomeScreen(){
		System.out.println("Show 6 Icons");
	}
}
class MotoOs extends AndroidOs{
	public  void showHomeScreen(){
		System.out.println("Show 10 Icons");
	}
	public void motoUpdate(){
		System.out.println("Show Update for moto only");
	}
}
class HirarichalOverride{
	public static void main(String[] args) {
		AndroidOs a1 = new AndroidOs();
		a1.showHomeScreen();
		SamsungOs s1 = new SamsungOs();
		s1.showHomeScreen();
		RedmiOs r1 = new RedmiOs();
		r1.showHomeScreen();
		MotoOs m1  = new MotoOs();
		m1.showHomeScreen();
		m1.motoUpdate(); 
	}
}
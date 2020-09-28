import  java.util.Vector;
class Mobile{
	String name;
	int price;
	String model;
	public Mobile(String name,int price,String model){
		this.name = name;
		this.price = price;
		this.model = model;
	}
	public String toString(){
		String info = name+" "+price+" "+model;
		return info;
	}
}
class Shoes{
	String brand;
	int size;
	int price;
	public Shoes(String brand,int size,int price){
		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	public String toString(){
		String info = brand+" "+size+" "+price;
		return info;
	}
}
class Shirts{
	String brand;
	int size;
	int price;
	public Shirts(String brand,int size,int price){
		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	public String toString(){
		String info  = brand+" "+size+" "+price;
		return info;
	}
}
class CartExample{
	public static void showCartDetails(Vector ref){
		for (int i=0;i<ref.size();i++) {
			System.out.println(ref.get(i));
		}
	}
	public static void main(String[] args) {
		Vector cart = new Vector();
		cart.add(new Mobile("Oppo",8000,"RealMe"));
		cart.add(new Shoes("Woodland",10,3200));
		cart.add(new Shirts("U S Polo",34,4000));

		showCartDetails(cart);
	}
}
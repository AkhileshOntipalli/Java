import java.util.LinkedList;
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
class Shirts{
	String brand;
	char size;
	int price;

	public Shirts(String brand,char size,int price){
		this.brand = brand;
		this.size = size;
		this.price  =price;
	}
	public String toString(){
		String info = brand+" "+size+" "+price;
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
		String  info = brand+" "+size+" "+price;
		return info;
	}
}
class CartExample{
	public static void showCartDetails(LinkedList l){
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
	public static void main(String[] args) {
		LinkedList cart = new LinkedList();
		cart.add(new Mobile("Oppo",8000,"Real Me"));
		cart.add(new Shirts("U S POLO",'M',2600));
		cart.add(1,20);
		cart.add(new Shoes("Woodland",10,3300));
		cart.add(1,30);

		showCartDetails(cart);
	}
}

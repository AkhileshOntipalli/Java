import java.util.LinkedList;
abstract class Vehicle{
	String company;
	int price;
	String name;
	abstract public String toString();
}
class Car extends Vehicle{
	public Car(String company,int price,String name){
		this.name = name;
		this.price = price;
		this.company = company;
	}
	@Override
	public String toString(){
		return company+" "+name+" "+price;
	}
}
class Bike extends Vehicle{
	public Bike(String company,int price,String name){
		this.name = name;
		this.price = price;
		this.company = company;
	}
	@Override
	public String toString(){
		return company+" "+name+" "+price;
	}
}
class VehicleExample{
	public static void showVehicleDetails(LinkedList ref){
		for (int i=0;i<ref.size();i++ ) {
				if (ref.get(i)instanceof Car) {
				Car c1  = (Car)ref.get(i);
				System.out.println(c1);
			}
			else{
				Bike b1 = (Bike)ref.get(i);
				System.out.println(b1);
			}
		}
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Car("Honda",900000,"City"));
		l1.add(new Bike("Hero",75000,"Glamour"));
		l1.add(new Car("VolkWagon",500000,"Polo"));
		l1.add(new Bike("Bajaj",60000,"Platina"));
		l1.add(1,new Bike("Suzuki",90000,"Gixxer"));
		l1.add(3,new Bike("Yamaha",110000,"FZ"));

		showVehicleDetails(l1);
	}
}
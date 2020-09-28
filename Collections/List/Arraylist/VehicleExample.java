import java.util.ArrayList;
abstract class Vehicle{
	String name;
	String model;
	int price;
	public abstract String toString();
}
class Car extends Vehicle{
	String name;
	String model;
	int price;
	public Car(String name,String model,int price){
		this.name = name;
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString(){
		String info =name+" "+model+" "+price;
		return info; 
	}
}
class Bike extends Vehicle{
	String name;
	String model;
	int price;
	public Bike(String name,String model,int price){
		this.name = name;
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString(){
		String info =name+" "+model+" "+price;
		return info; 
	}
}
class VehicleExample{
	public static void showVehicleDetails(ArrayList ref){
		for (int i=0;i<ref.size();i++) {
			Object obj = ref.get(i);
				System.out.println(obj);
				System.out.println("------------------------------ ");
				
		}
	}
	public static void main(String[] args) {
		ArrayList vehicle = new ArrayList();
		vehicle.add(new Car("Maruti Suzuki","Dzire",900000));
		vehicle.add(new Bike("Royal Enfield","Classic",160000));
		vehicle.add(new Car("Honda","City",1300000));
		vehicle.add(new Bike("Yamaha","R15",150000));

		showVehicleDetails(vehicle);
	}
}
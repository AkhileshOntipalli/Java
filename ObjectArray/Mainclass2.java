class Mobile
{
	String model;
	Double price;
	String brand;

	public Mobile(String model,Double price,String brand)
	{
      this.model = model;
      this.price = price;
      this.brand = brand;
    }
	@Override
	public String toString()
	{
		String info=model+" "+price+" "+brand;
		return info;
	}
}
class Shoes
{
	String brand;
	Double price;
	int size;

	public Shoes(String brand,Double price,int size)
	{
		this.brand = brand;
		this.price = price;
		this.size  = size;
	}
	@Override
	public String toString()
	{
		String info=brand+" "+price+" "+size;
		return info;
	}
}
class Shirts
{
	String brand;
	Double price;
	char size;

	public Shirts(String brand,Double price,char size)
	{
		this.brand = brand;
		this.price = price;
		this.size  = size;
	}
	@Override
	public String toString()
	{
		String info=brand+" "+price+" "+size;
		return info;
	}
}
class Mainclass2
{
	public static void ShowcartProducts(Object[] cart)
	{
	  for (int i=0;i<cart.length;i++ ) 
	  {
	  	System.out.println(cart[i]);
	  }
	}
	public static void main(String[] args) 
	{
		Object[] cart = new Object[3];
		 
		cart[0] = new Mobile("realme",8000.00,"oppo");
		cart[1] = new Shoes("woodland",3200.00,10);
		cart[2] = new Shirts("U.S.Polo",2600.00,'M');
     
        ShowcartProducts(cart);
    }
}
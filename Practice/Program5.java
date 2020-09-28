class Program5
{
  public static void main(String[] args) 
  {

  	

	int personone = 22;
	int persontwo = 36;
	int personthree = 55;

  


	  if (personone > persontwo && personone > personthree && personone>0 && personone<100 &&  persontwo>0 && persontwo<100 && personthree>0 && personthree<100 ) 
	  {
     System.out.println(personone + " age is the oldest person");
    }
    else if (persontwo > personthree && persontwo > personone && persontwo>0 && persontwo<100 && personone>0 && personone<100 && personthree>0 && personthree<100) 
    {
     System.out.println(persontwo + " age is the oldest person");
    }
    else if (personthree > personone && personthree > persontwo && personthree>0 && personthree<100 && personone>0 && personone<100 &&  persontwo>0 && persontwo<100 ) 
    {
     System.out.println(personthree + " age is the oldest person");	
    } 
    else 
    {
      System.out.println("age should between 0 to 100 ");
    }
    if (personone < persontwo && personone <personthree && personone>0 && personone<100 &&  persontwo>0 && persontwo<100 && personthree>0 && personthree<100 ) 
    {
     System.out.println(personone + " age is the youngest person"); 
    }
    else if (persontwo < personthree && persontwo < personone && persontwo>0 && persontwo<100 && personone>0 && personone<100 && personthree>0 && personthree<100) 
    {
     System.out.println(persontwo + " age is the youngest person"); 
    }
    else if (personthree < personone && personthree < persontwo && personthree>0 && personthree<100 && personone>0 && personone<100 &&  persontwo>0 && persontwo<100) 
    {
     System.out.println(personthree + " age is the youngest person"); 
    }
    else 
    {
      System.out.println("age should between 0 to 100 ");
    }  
  } 

  
}
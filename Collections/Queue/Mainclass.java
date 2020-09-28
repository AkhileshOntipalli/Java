import java.util.PriorityQueue;
class Customer implements Comparable
{
	String email;
	String name;
	int priority;

	public Customer(String email,String name,int priority)
	{
		this.email = email;
		this.name = name;
		this.priority = priority;
	}
    @Override
	public int hashCode()
	{
		return priority;
	}

	@Override
	public int compareTo(Object obj)
	{
		int res = obj.hashCode()-this.hashCode();

		return res;
	}
    @Override
	public String toString()
	{
		String info = name+" "+email+" "+priority;
		return info;
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();

        pq.add(new Customer("c1","c1@gmail.com",5));
        pq.add(new Customer("c2","c2@gmail.com",8));
		pq.add(new Customer("c3","c3@gmail.com",10));
		pq.add(new Customer("c4","c4@gmail.com",5));
		pq.add(new Customer("c5","c5@gmail.com",10));

		int sz = pq.size();
		for (int i=1;i<=sz;i++) 
		{
		 System.out.println(pq.poll());	
		}
	}
}	
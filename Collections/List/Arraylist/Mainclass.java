import java.util.ArrayList;
class Mainclass
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;

		for (int i=0;i<numbers.length;i++) 
		{
			System.out.println(numbers[i]);
		}

		ArrayList a1 = new ArrayList();

		a1.add(10);
		a1.add(20.56);
		a1.add(30);
		a1.add("Hello");
		for (int index = 0;index<a1.size();index++ ) 
		{
			System.out.println(a1.get(index));
		}

		

	}
}
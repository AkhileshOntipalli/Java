import java.util.*;
class Exercise6{
	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<>();
		m.put(1,"Red");
		m.put(2,"Green");
		m.put(3,"Orange");
		m.put(4,"Black");
		m.put(5,"White");
		System.out.println(m);
		HashMap<Integer,String> m2 =(HashMap<Integer,String>)m.clone();
		System.out.println(m2);
	}
}
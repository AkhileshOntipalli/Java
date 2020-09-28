import java.util.*;
class Exercise9{
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1,"Red");
		m.put(2,"Green");
		m.put(3,"Orange");
		m.put(4,"Black");
		m.put(5,"White");

		
		System.out.println(m);
		Set s = m.entrySet();
		System.out.println(s);
		for (Map.Entry x :m.entrySet()) {
			System.out.println(x);
		}
	}
}
import java.util.*;
class Exercise11{
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1,"Red");
		m.put(2,"Green");
		m.put(3,"Orange");
		m.put(4,"Black");
		m.put(5,"White");

		System.out.println(m);
		Set keySet = m.keySet();
		System.out.println(keySet);

		
		System.out.println(m.values());
	}
}
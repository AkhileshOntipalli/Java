import java.util.*;
class Exercise3{
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1,"Red");
		m.put(2,"Green");
		m.put(3,"Orange");
		m.put(4,"Black");
		m.put(5,"White");
		System.out.println(m);

		Map<Integer,String> m2 = new HashMap<>();
		m2.put(1,"Yellow");
		m2.put(2,"Pink");
		System.out.println(m2);

		m2.putAll(m);
		System.out.println(m2);

	}
}
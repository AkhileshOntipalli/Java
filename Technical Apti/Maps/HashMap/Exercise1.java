import java.util.*;
class Exercise1{
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1,"Red");
		m.put(2,"Green");
		m.put(3,"Orange");
		m.put(4,"Black");
		m.put(5,"White");

		for (Map.Entry x :m.entrySet() ) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		Set s = m.entrySet();
		System.out.println(s);
	}
}
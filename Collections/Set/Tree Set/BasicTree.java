import java.util.*;
class BasicTree{
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add("java");
		t1.add("Python");
		t1.add("C++");
		t1.add("Html");
		t1.add("CSS");
		t1.add("Springs");
		t1.add("HiberNate");
		t1.add("java");
		t1.add("Python");
		Iterator i = t1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(t1.size());
		
	}
}
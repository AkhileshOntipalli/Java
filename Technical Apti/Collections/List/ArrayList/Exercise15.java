import java.util.*;
class Exercise15{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Yellow");
		list2.add("Pink");
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);

	}
}
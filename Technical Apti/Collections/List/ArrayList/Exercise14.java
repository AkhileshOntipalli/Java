import java.util.*;
class Exercise14{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		System.out.println(list);

		Collections.swap(list,0,4);
		System.out.println(list);
	}
}
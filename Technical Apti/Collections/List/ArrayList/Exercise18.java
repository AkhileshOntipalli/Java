import java.util.*;
class Exercise18{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
	}
}
import java.util.*;
class Exercise13{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Orange");
		list2.add("Black");
		list2.add("White");

		List<String> list3 = new ArrayList<>();

		for (Object obj :list ) {
			list3.add(list2.contains(obj)?"Yes":"No");
			
		}
		System.out.println(list3);
	}
}
import java.util.*;
class Exercise2{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Orange");
		list.add("Green");
		list.add("Black");
		list.add("White");
		System.out.println(list);

		/*Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}*/
		for (Object obj :list ) {
			System.out.print(obj+" ");
		}
	}
}
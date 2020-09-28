import java.util.*;
class Exercise9{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		System.out.println(list);

		List<String> list2 = new ArrayList<String>();
  		list2.add("A");
  		list2.add("B");
  		list2.add("C");
  		list2.add("D");
  		System.out.println(List2);

  		Collections.copy(list,list2);
  		System.out.println(list);
	}
}
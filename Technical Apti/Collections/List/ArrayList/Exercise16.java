import java.util.*;
class Exercise16{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		System.out.println(list);

		ArrayList<String> list2 =(ArrayList<String>)list.clone();
		System.out.println(list2);


	}
}
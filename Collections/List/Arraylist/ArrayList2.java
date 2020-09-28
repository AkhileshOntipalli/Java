import java.util.*;
class ArrayList2{
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println("Initial Size = "+a1.size());
		a1.add("Satya");
		a1.add("akhilesh");
		System.out.println("Size = "+a1.size());
		System.out.println("Elements Present : "+a1);
		a1.remove("Satya");
		System.out.println("Elements Present : "+a1);
		a1.add("Durga");
		System.out.println("Elements Present : "+a1);
		a1.add(0,"Satya");
		System.out.println("Elements Present : "+a1);
		a1.remove(0);
		System.out.println("Elements Present : "+a1);
		a1.set(1,"Ontipalli");
		System.out.println("Elements Present : "+a1);
		int pos = a1.indexOf("Ontipalli");
		System.out.println("Position of Ontipalli : "+pos);
		int pos1 = a1.indexOf("Rana");
		System.out.println("Position of Rana : "+pos1);
		int pos2 = a1.indexOf("Vasu");
		System.out.println("Position of Vasu : "+pos2);
		String sb = (String)a1.get(1);
		System.out.println("at index = "+sb);
		boolean b = a1.contains("akhilesh");
		System.out.println(b);
		a1.clear();
		System.out.println("Elements After Clear : "+a1);
	}
}
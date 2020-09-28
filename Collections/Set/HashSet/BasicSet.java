import java.util.*;
class BasicSet{
	/*public static void main(String[] args) {
		HashSet h1  = new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(null);
		h1.add(null);
		h1.add(20);
		h1.add(30);
		h1.add(50);
		h1.add("Satya");
		System.out.println(h1.size());
		System.out.println("----------------------------");
		Iterator i1 = h1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());			
		}
	}*/
	public static void main(String args[]) 
    { 
        Set<Integer> a = new HashSet<Integer>(); 
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        Set<Integer> b = new HashSet<Integer>(); 
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
  
        // To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        // To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
    } 
}
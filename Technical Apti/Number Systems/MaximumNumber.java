import java.util.*; 
  
class MaximumNumber { 
        static void printLargest(Vector<String> arr){ 
      
        Collections.sort(arr, new Comparator<String>(){ 
        @Override
        public int compare(String X, String Y) { 
        String XY=X + Y; 
        String YX=Y + X; 
        return XY.compareTo(YX) > 0 ? -1:1; 
    } 
    }); 
    Iterator it = arr.iterator(); 
    while(it.hasNext()) 
        System.out.print(it.next()); 
      
    } 
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in);  
        Vector<String> arr = new Vector<>(); 
        arr.add(sc.next()); 
        arr.add(sc.next()); 
        arr.add(sc.next()); 
        arr.add(sc.next()); 
        printLargest(arr); 
    } 
} 
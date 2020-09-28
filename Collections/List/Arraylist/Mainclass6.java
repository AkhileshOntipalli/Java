import java.util.*;
public class Mainclass6 {
public static void main(String[] args) {
ArrayList a = new ArrayList();
System.out.println("initial size = "+a.size());
//initial size = 0
a.add("aatif");
a.add("salman");
System.out.println("size "+a.size());
// size = 2
System.out.println("elements present "+a);
//elements present [aatif, salman]
a.remove("salman");
System.out.println("elements present "+a);
//elements present [aatif]
a.add("salman");
System.out.println("elements present "+a);
//elements present [aatif, salman]
a.add(0,"satya");
System.out.println("elements present "+a);
//elements present [satya, aatif, salman]
a.remove(0);
System.out.println("elements present "+a);
//elements present [aatif, salman]
a.set(1, "sadaf");
System.out.println("elements present "+a);
//elements present [aatif, sadaf]
int pos= a.indexOf("aatif");
System.out.println("position of = "+pos);
//posiition of = 0
int pos1= a.indexOf("preeti");
System.out.println("position of = "+pos1);
//position of = -1
String sb = (String) a.get(1); //upcasted to object type
System.out.println("at index = " +sb);
//at index = sadaf
Boolean b = a.contains("salman");
System.out.println(b); // returns false
a.clear();
System.out.println("Elements after clear " +a);
//elements after clear = []; empty
}}
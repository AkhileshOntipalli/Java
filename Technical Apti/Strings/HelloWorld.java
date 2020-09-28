import java.util.Scanner;
public class HelloWorld {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);   	
      String s1= sc.next();
      char[] c1 = s1.toCharArray();
      for (int i = c1.length-1;i >= 0; i--) {
      	if (c1[i]==' ') {
      		
      	}
      	System.out.print(c1[i]);
      }
      
      	
   }
}
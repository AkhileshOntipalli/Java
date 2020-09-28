import java.util.Scanner;

public class ReverseNumber{

public static int swap(int num){
        // handle the case if num > 10000
        if( num > 0 && num <= 10000) {

            int result = 0;
            while( num > 1) {

                result = result * 10 + (num % 10);
                num = num / 10;
            }

            return num > result ? num : result;
          
        } else {
            return 0;
        }
   } 
     public static void main(String[] args) {
     try( Scanner scan = new Scanner(System.in)) {

        int res = swap(scan.nextInt());
        System.out.println(res);

     }   
   }
}
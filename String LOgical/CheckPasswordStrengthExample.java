import java.util.Scanner;
public class CheckPasswordStrengthExample 
{
 public static int calculatePasswordStrength(String password)
 {
    
    int count = 0;
    Boolean s1 = password.matches("(?=.*[A-Z]).*");
    Boolean s2 = password.matches("(?=.*[0-9]).*");
    Boolean s3 = password.matches("(?=.*[~!@#$%^&*()_-]).*");
    
    if( (password.length() >= 8) && s1 && s2 && s3)
        return count = 1;

    else if(s1 && s2 && s3)
        return count = 2;
    else if((password.length() >= 8) && s2 && s3)
         return count = 3;
    
    else 
        return count = -1;
 } 
 public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);

     String password = sc.next();
     

      int result = calculatePasswordStrength(password);
      System.out.println(result);
        
    }
    
}


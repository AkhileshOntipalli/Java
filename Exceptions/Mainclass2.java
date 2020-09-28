public class Mainclass2 {
public static void test(int n)
{
System.out.println("enter test");
int a1 [] = {10,20,30};
String s1 = "hello";
Object obj = s1; // upcasting of string into object class
try
{
System.out.println("result : "+10/n);
System.out.println("array element : "+a1[n]);
StringBuffer sb1 = (StringBuffer)obj; //direct downcasting of object class into StringBuffer throw ClassCastException
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String[] args) {
System.out.println("Program start");
test(2);
System.out.println("Program ends");
}}
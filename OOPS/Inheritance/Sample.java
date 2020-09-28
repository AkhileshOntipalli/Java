final class Parent{
    int a = 10;
}
 class Child extends Parent{
    int d = 50;
    public void test(){
       System.out.println("This is Test()");
    }
}
public class Sample{

     public static void main(String []args){
        System.out.println("Hello World");
        Child c1 = new Child();
        c1.test();
     }
}
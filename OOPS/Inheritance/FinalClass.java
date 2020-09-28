class Super1
{
 int a =50;
 public void display(){
 	System.out.println("This is Parent class");
 }
}
class Child extends Super1
{
int d=10;
public void test()
{
System.out.println("this is child class " +d);
System.out.println("this is super class" + a);
// here it return error as a has private access in super
}}
class FinalClass{
public static void main(String[] args) {
Child c1 = new Child();
c1.test();
c1.display();
}
}
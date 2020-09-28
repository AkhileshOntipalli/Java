class SuperClass
{
public void display()
{
System.out.println("this is display() of SuperClass");
}}
class SuperClass2 extends SuperClass
{
public void click()
{
System.out.println("this is click() method of SuperClass2");
}
}
class Subclass extends SuperClass2
{
public void count()
{
System.out.println("this is count() of Subclass");
}}
class SuperClass1
{
public static void main(String[] args)
{
System.out.println("Program start....");
SuperClass2 ref1=new Subclass(); //upcasting
ref1.click();
ref1.display();
System.out.println();
SuperClass ref2 = new Subclass(); //upcsting
ref2.display();
System.out.println();
Subclass ref3 = (Subclass) ref1; // downcasting
ref3.click();
ref3.display();
ref3.count();
System.out.println();
SuperClass2 ref4 = (SuperClass2) ref2; // downcasting
ref4.display();
ref4.click();
System.out.println();
Subclass ref5= (Subclass) ref2;
ref5.display();
ref5.click();
ref5.count();
System.out.println("program end......");
}}
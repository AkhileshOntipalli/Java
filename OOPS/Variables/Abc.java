class Abc{
int z1=123;
public void view(){
int a = 20;
System.out.println("this is view() of Abc");
System.out.println("value of a = " + z1);
System.out.println("value of a = " + a);
}
public static void main(String[] args){
System.out.println("Z1 = " + new Abc().z1);
new Abc().view();
System.out.println("value of a = " + a); // throws an error
}
}
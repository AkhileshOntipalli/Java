class Narrowing
{
public static void test(int x )
{
System.out.println("this is test(int x) of sample");
}
public static void main(String[] args)
{
double d = 10.5;
int y = (int)d;
test(y);
long l = 25;
int a = (int)l;
test(a);
}
}
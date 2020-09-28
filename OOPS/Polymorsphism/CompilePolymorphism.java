class Parent{
    public void test(){
        System.out.println("Parent Test Method");
    }
    public void count(){
        System.out.println("Count Method");
    }
}
class Child extends Parent{
    @Override
    public void test(){
        System.out.println("Test Method");
    }
    public void count(){
        System.out.println("Count Method");
    }
}
class CompilePolymorphism{

     public static void main(String []args){
        Parent p = new Child();
        p.test();
        p.count();
        
     }
}
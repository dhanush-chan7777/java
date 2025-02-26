interface A{
    static void a(){
        System.out.print("Method A in interface 1");
    }
    abstract void b();
    
    default void c(){
        System.out.print("Method C in interface 1");

}
}
interface B extends A{
    static void a(){
        System.out.println("its method a");
    }
    abstract  void b();
    default void c(){
       System.out.println("its method c");
    }
}

class C implements B {
    public void b(){
        System.out.println("its method b");
    }
}
public class MultipleInterface{
    public static void main(String []args){
        C obj=new C();
        B.a();
        obj.b();
        obj.c();
    }
}

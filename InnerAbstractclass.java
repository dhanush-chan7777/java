abstract class A{
    abstract void a();
    void b(){
        System.out.println("its method b");
    }
    
 abstract class B {
     abstract void c();
     public void d(){
         System.out.println("its method d");
     }
 }
}
class C extends A{
    public void a(){
        System.out.println("its method a");
    }
    class E extends B{
    public void c(){
        System.out.println("its method c");
    }
    }
}

public class InnerAbstractclass{
    public static void main(String[] args){
     
     C obj=new C();
     obj.a();
     obj.b();
     
     C.E obj2=obj.new E();
          obj2.c();

     obj2.d();
    }
}

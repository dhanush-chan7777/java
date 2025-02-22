import java.util.Scanner;
class Parent{
    Scanner s=new Scanner(System.in);
    public void a(){
        System.out.print("overide ");
    }
    private void b(){
        System.out.print("overide");
        
    }
    protected void c(){
        System.out.print("overide");
    }
    void d(){
        System.out.print("overide");
    }
    static void e(){
        System.out.print("overide");
    }
}
class Child extends Parent{
    public void a(){
        System.out.println("overided ");
    }
    private void b(){
        System.out.println("overided");
        
    }
    protected void c(){
        System.out.println("overided");
    }
    void d(){
        System.out.println("override");
    }
    static void e(){
        System.out.println("overided");
    
}
}


public class MethodoveridingAccess{
    public static void main(String []args){
        Child obj=new Child();
        obj.a();
      
       obj.c();
       obj.d();
       obj.e();
    }
}

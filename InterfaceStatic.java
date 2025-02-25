interface testInterface {
      static int a=10;
       void method();

   static void test(){
       System.out.print("static::"+a);
   }
    
}
class Testing implements testInterface{
    public void method(){
      System.out.println("TESTING::"+a);
       
  }
     
}
public class InterfaceStatic{
    public static void main(String []args){
        Testing obj=new Testing();
        obj.method();
        System.out.println(obj.a);
        testInterface.test();
    }
}

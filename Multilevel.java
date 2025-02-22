class Supermost{
    private int a=19;
    private void most(){
        System.out.println("Value of a::"+a);
    }
    public void show(){
        most();
    }
    
}
class Superclass extends Supermost{
    protected int b=20;
    
    protected void Key(){
        System.out.println("Value of b::"+b);
    }
}
class Sub extends Superclass{
    int c=21;
    void sub(){
        System.out.println("Value of c::"+c);
        }
}

public class Multilevel{
    public static void main(String []args){
        Sub obj=new Sub();
        obj.sub();
        obj.Key();
        obj.show();
        
    }
}

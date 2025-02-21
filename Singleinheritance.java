class Parentclass{
    private int a=10,b=5;
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
}
class Child extends Parentclass{
    int c;
    public void sum(){
        c=get_a()+get_b();
        System.out.println(c);
    }
}

public class Singleinheritance{
    public static void main(String []args){
        Child obj=new Child();
        obj.get_a();;
        obj.get_b();
        obj.sum();
        
    }
}

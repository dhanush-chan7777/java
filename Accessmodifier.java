import java.util.Scanner;
class Add{
    private int a,b,c,d;
    private void get(){
        Scanner s=new Scanner(System.in);
         a =s.nextInt();
         b=s.nextInt();
         c=s.nextInt();
    }
    public void sum(){
        get();
        int d=a+b+c;
        System.out.println("Sum of the Number::"+d);
    }
}
public class Accessmodifier{
    public static void main(String []args){
        Add obj=new Add();
        
        obj.sum();
    }
}

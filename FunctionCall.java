import java.util.Scanner;

class Add{
    public int a,b,sum;
public void Display(){
        int sum=a+b;
    System.out.print("Sum::"+sum);
}}
public class FunctionCall{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
         Add obj=new Add();

        obj.a=s.nextInt();
        obj.b=s.nextInt();
    
        obj.Display();
    }
}

import java.util.Scanner;
abstract class Circle{
   static  double area,circumference,num;
    
    
   static void get(){
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
    }
    
   static void area(){
   
    area=3.14*num*num;
    System.out.println("Area::"+area);
    }
   static void circumference(){
        
        circumference=2*3.14*num;
        System.out.print("Circumference::"+circumference);
        
    }
}
public class AreaAbstract{
    public static void main(String []args){
        
        Circle.get();
        Circle.area();
        Circle.circumference();
    }
}

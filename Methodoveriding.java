import java.util.Scanner;

class Shape{
    protected double area;
    public void CalculateArea(){
        System.out.print("Area of Shapes::");
     }
}
class Square extends Shape{
    private int a;
    public void get(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter value A::");
        a=s.nextInt();
        
    }
    
    public void CalculateArea(){
        area=a*a;
        System.out.print("Area of Square::"+area);
    }
        
    }
    
class Circle extends Shape{
    private double a=10;
    public void CalculateArea(){
        area=3.14*a*a;
        System.out.print("area of circle::"+area);
    }
}
public class Methodoveriding{
    public static void main(String []args){
        Square obj=new Square();
     obj.get();
        obj.CalculateArea();
        
        Circle obj2=new Circle();
  
        obj2.CalculateArea();
    }
}

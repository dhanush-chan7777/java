import java.util.Scanner;
abstract class Circle{
    protected double area;
    abstract void Cal_area();
    
}
class Area extends Circle{
    private double r;
    protected Area(){
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
    }
    void Cal_area(){
        area=3.14*r*r;
        System.out.println("Area:"+area);
    }
  
public static void main(String []args){
    Area obj=new Area();
 obj.Cal_area();
}
}
























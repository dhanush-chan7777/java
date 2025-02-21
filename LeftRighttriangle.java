class LeftangleTriangle{
    void triangle(int n){

    
    for(int i=0;i<n;i++){
        for(int j=i;j<=n;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
        
    }
    }
}
class RightangleTriangle{
    void triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
public class LeftRighttraingle{
    public static void main(String []args){
        int n=6;
        System.out.print("Leftangle Triangle");
        LeftangleTriangle obj=new LeftangleTriangle();
        obj.triangle(n);
        
       System.out.print("Rightangle Traingle");
        RightangleTriangle obj2=new RightangleTriangle();
        obj2.triangle(n);
        
    }
}

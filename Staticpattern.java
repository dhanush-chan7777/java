 class Pattern{
    static int n=4;
    static class Static{
    static void display(){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("# ");
                    
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            
        }
    }
}
}

public class Staticpattern{
    public static void main(String []args){
        Pattern.Static.display();
    }
}

public class ArrowPattern{
    public static void main(String []args){
        int n=3;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<1;i++){
            for(int j=0;j<n;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i==1){
            System.out.println();
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                
                System.out.print(" ");
                
            }
            
            for(int k=1;k<=i;k++){
                if(i==3 && k==2){
                    System.out.print(" ");
                   
                }
                else if(i==3 && k==3){
                    System.out.print(" * ");
                }
                else{
                System.out.print("* ");
                }
            }
            System.out.println();
        }
        
        
    }
}

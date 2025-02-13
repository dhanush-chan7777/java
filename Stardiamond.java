public class Stardiamond{
    public static void main(String args[]){
        int n=4;
        
        for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
            
        }
        
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
          if(i>1){
           
           for(int l=i-1;l>=1;l--){
               
                System.out.print("*");
                
          }
        }
        System.out.println();
        }
        
        n=n-1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            
            for(int k=n;k>=i;k--){
                System.out.print("*");
            }
            if(i<n){
                for(int l=n-1;l>=i;l--){
                    System.out.print("*");
                }
            } 
            System.out.println();
        }
    }
}

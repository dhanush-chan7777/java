public class Numbertriangle{
    public static void main(String []args){
      int n=4;
      int sum=0;
    
     for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");}
        for(int k=1;k<=i;k++){
                        System.out.print(k);
        
        }
          if(i>1){
           
           for(int l=i-1;l>=1;l--){
               
                System.out.print(l);
                
          }

          }


        
        System.out.println();
        
        
        }
        
     }
    }

public class Consecutiveno{
    public static void main(String []args){
        int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
        
        int c=0;
        int max=0;
        int max2=0;
        int max3=0;
        for(int i=0;i<arr.length;i++){
          
          if(arr[i]==1){
              max=c++;
              
              
              }
              else if(arr[i]==0){
                  max2=c;
                  c=0;
                  
              }
             if(max<max2){
                 max3=max2;
             }
                
            
        }
        System.out.print(max3); 
        
    }
}

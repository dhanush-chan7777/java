public class Arraysort{
    public static void main(String []args){
        int arr[]={5,4,3,2,1};
        int max2=0;
        int max3=0;
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
                max2=arr[i-1];
           }
         }
        System.out.println("largest no::"+max);
        System.out.println("Second largest no::"+max2);
        int temp=0;
       for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length;j++){
            
            if(arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
               
                
            }
        }
      
     }
                    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
     
        
        
    }
}

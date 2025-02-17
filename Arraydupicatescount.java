public class Arrayduplicatescount{
    public static void main(String []args){
        int arr[]={3,2,3,1,2,9};
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean duplicates=false;
            count=1;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    duplicates=true;
                    count++;
                    arr[j]=-1;
                }
              
                
            }
                if(arr[i]!=-1){
                    System.out.print(arr[i]);
                     System.out.print(count);
                     System.out.println();
                }
                
            
                                   
          
          } 
            

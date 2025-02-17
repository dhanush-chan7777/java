public class Reorderarray{
    public static void main(String []args){
        int arr[]={1,2,4,3,5,0,6,0,9,0,4};
        int prev=0;
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]!=0){
                prev=arr[i];
                
            }
            else if(arr[i]==0){
                continue;
                
            }
            System.out.print(prev);
         }
         
    for(int j=0;j<arr.length;j++){
        if(arr[j]==0){
            c=arr[j];
        }
        else if(arr[j]>0){
            continue;
        }
        System.out.print(c);
    }
        }
}

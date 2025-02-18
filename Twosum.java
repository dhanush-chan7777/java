public class Twosum{
    public static void main(String []args){
        int arr[]={2,7,5,4};
        int n=9;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(i<j){
                if(arr[i]+arr[j]==n){
                    System.out.print("("+i+","+j+")");
                    count++;
                }
                }
            }
            
        }
        System.out.println();
        System.out.println("COUNT::"+count);
        
    }
}

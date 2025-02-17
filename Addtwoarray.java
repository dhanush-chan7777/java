public class Addtwoarray{
    public static void main(String []args){
        String a="73762856382537";
        String b="63846493738273";
        
        char[] arr=a.toCharArray();
        char[] arr2=b.toCharArray();
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr2.length;j++){
            
        if(i==j){
       int  sum=Character.getNumericValue(arr[i])+Character.getNumericValue(arr2[j]);
       
   System.out.print(sum);
        }
        }
    }
          
        
 
    
}
}

public class SpiralTwoDmatrix
{
	public static void main(String[] args) {
        int arr[][]={
            
        {1,2,3,4,5},
          {6,7,8,9,10},
          {11,12,13,14,15},
          {16,17,18,8,20},
          {21,22,23,24,25}
          };
        
       
           int right=arr[0].length-1;
           int bottom=arr.length-1;
            int left=0;
            int top=0;
            
 while (top <= bottom && left <= right) {
    for(int i=left;i<=right;i++){
        System.out.print(arr[top][i]+" ");
      
        }top++;
    for(int j=top;j<=bottom;j++){
        System.out.print(arr[j][right]+" ");
        
    }right--;
    if(top<=bottom){
    for(int k=right;k>=left;k--){
        System.out.print(arr[bottom][k]+" ");
        
    }bottom--;
    }
    if(left<=right){
    for(int l=bottom;l>=top;l--){
        System.out.print(arr[l][left]+" ");
    }left++;
    }
 }
    
    
   
    }
            
	}


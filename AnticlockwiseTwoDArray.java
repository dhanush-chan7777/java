public class AnticlockwiseTwoDArray
{
	public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
    
        };
            
int m=arr.length-1;           
  for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
         
      System.out.print(arr[j][m]+" ");
      
      if(j==arr.length-1){
          System.out.println();
          m--;
         
      }
  }
  }
	}
}

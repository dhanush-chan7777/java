public class Oddsumevensum{
    public static void main(String []args){
        int number=123456;
        int oddsum=0;
        int evensum=0;
        int rem=0;
        
        while(number>0){
            rem= number%10;
            number=number/10;
            if(rem%2!=0){
                 oddsum =oddsum*10+rem;
            
            }
            else{
                evensum=evensum*10+rem;
            }
           
                          
        }
         System.out.println("ODD SUM::" +oddsum);
                  System.out.println("EVEN SUM::" +evensum);

         
    
    }
}

public class Dowhileprime{
    public static void main(String[] args){
        
        int num=3;
        do{
            boolean isPrime=true;
            
            int i=2;
            do{
                if(num%i==0){
                isPrime=false;
                }
                i++;
            }while(i<=num/2);
            
            if(isPrime){
                System.out.print(num+" ");
            }
           num++; 

            
        }while(num<=1000);
    }
}

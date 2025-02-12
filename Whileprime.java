

public class Whileprime {
    public static void main(String[] args) {
    
      int num=3;
      while(num<=100){
            boolean isPrime = true; 

         
               int i=2;
               while(i<=num/2){
                if (num % i == 0) {
                    isPrime = false; 
                }
                i++;
            }

            if (isPrime) {
                System.out.print(num+" ");
            }
            num++;
        }
    }
}

public class SumofFactorial{
    public static void main(String []args){
        for(int num=1;num<=1000;num++){
        int N=num;
        int length=0;
        while(N>0){
            length++;
            N=N/10;
        }
          N=num;
        
          int sum=0;
       for(int i=0;i<length;i++){
           int digit=N%10;
           sum+=factorial(digit);
           N=N/10;
       }
       if(sum==num){
       System.out.println("Factiorial of a Number::"+sum);
       }
    }
}

    public static  int factorial(int N){
        int fact=1;
        for(int j=1;j<=N;j++){
            fact=fact*j;
        }
        return fact;
    }
}

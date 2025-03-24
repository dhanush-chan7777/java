public class Gcd{
    public static void main(String[] args){
        int num1=20,num2=30;
    int n=Math.min(num1,num2);
    int divisor=0;
    for(int i=1;i<n;i++){
        if(num1%i==0  && num2%i==0){
            if(divisor<i){
                divisor=i;
            }
            
        }
    }
    System.out.print(divisor);
    }
}

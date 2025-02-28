public class NivenNumbers {
    public static void main(String []args){
        int num=16;
        int N=num;
        int sum=0;
        while(num>0){
           int digit =num%10;
           sum+=digit;
           num=num/10;
        }
        if(N%sum==0){
            System.out.print("Its a Niven Number");
        }
        else{
            System.out.print("Its not a Niven Number");
        }
    }
}

public class HarshadNumber {
    public static void main(String []args){
    int num=12;
    int N=num;
    int sum=0;
    while(N>0){
        int digit=N%10;
         sum+=digit;
         N=N/10;
    }
    if(num%sum==0){
        System.out.println("its a harshad number");
        
    }
    else{
        System.out.println("its not a harshad number");
    }

    
}
}


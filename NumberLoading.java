public class NumberLoading {
   public static void pronic(int num){
        int count=0;
        for(int i=1;i<=num;i++){
        
            if(i*(i+1)==num){
                count++;
            }
        }
        if(count>0){
            System.out.println("this is Pronic number");
        }

    }

   public static void abundant(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;

            }
        }
        if(num<sum){
            System.out.println("Its a abundant number");
        }
    }
    public static void niven(int num){
        int N=num;
        int sum=0;
        while(num>0){
           int digit =num%10;
           sum+=digit;
           num=num/10;
        }
        if(N%sum==0){
            System.out.println("Its a Niven Number");
        }
    }
    public static void main(String []args){
       int num=48;
        pronic(num);
        abundant(num);
        niven(num);
    }
}

    


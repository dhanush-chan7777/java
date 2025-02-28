public class AbundantNumber {
    public static void main(String []args){
        int num=12;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;

            }
        }
        if(num<sum){
            System.out.print("Its a abundant number");
        }
        else{
            System.out.print("Its not a abundant number");
        }
    }
    
}

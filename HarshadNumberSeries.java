public class HarshadNumberSeries {
    public static void main(String []args){
        for(int num=500;num<=2500;num++){
    int N=num;
    int sum=0;
    while(N>0){
        int digit=N%10;
         sum+=digit;
         N=N/10;
    }
    if(num%sum==0){
        System.out.println(num);
        
    }


}
}
}


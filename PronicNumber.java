public class PronicNumber{
public static void main(String []args){
 
    int num=13;
    int count=0;
    for(int i=1;i<=num;i++){
    
        if(i*(i+1)==num){
            count++;
        }
    }
    if(count>0){
        System.out.print("this is Pronic number");
    }
    else{
        System.out.print("this is not pronic");
    }
}
}

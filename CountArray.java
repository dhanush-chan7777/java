public class CountArray{
    public static void main(String []args){
        int count=0;
        int a[]={1,1,0,1,1,0};
        int b[]={1,1,0,1,1,0};
        
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                count++;
            }
        }
        System.out.print("COUNT::"+count);
    }
}

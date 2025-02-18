public class CountArray{
    public static void main(String []args){
        int count=0;
        int notmatched=0;
        int a[]={1,1,0,1,1,0,8};
        int b[]={1,1,0,1,8,0};
        
        int n=Math.min(a.length,b.length);
        for(int i=0;i<n;i++){
            if(a[i]==b[i]){
                count++;
            }
            else{
                notmatched++;
            }
        }
        System.out.println("Matched::"+count);
        System.out.println("Notmatched::"+notmatched);
    }
}

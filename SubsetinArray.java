public class SubsetinArray{
    public static void main(String []args){
        int count=0;
        int notmatched=0;
        int a[]={1,1,0,1,1,0,8};
        int b[]={1,1,8};
        
        int min=Math.min(a.length,b.length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                
                if(a[i]==b[j]){
                    count++;
                    a[i]=-1;
                    b[j]=-1;
                }
            }
        }
                
            if(count==min){
                System.out.print("this is a subset");
                
                
            }
            else{
                System.out.print("this is not a subset");
            }
                 }
}

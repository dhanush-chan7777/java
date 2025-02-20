class Counter{
    static int count=0;
   
    
    Counter(){
        count++;
      
        
    }
    
}

public class Objectcounting{
    public static void main(String []args){
         for(int i=1;i<=3;i++){
        Counter obj=new Counter();
    
         System.out.println("Object created count::"+obj. count);

     }
    }
}


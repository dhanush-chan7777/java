abstract class Create{
    final int members;
    static int  vari;
     Create(int value){
        members=value;
    }
}
 
class Initialize extends Create{
     Initialize(){
        super(10);
        vari=5;
    }
}


public class FinalKeyword{
    public static void main(String []args){
        Initialize obj=new Initialize();
        System.out.println(obj.members);
      
    }
}

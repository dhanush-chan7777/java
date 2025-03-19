public class RomanToInteger{
    
   static int value(char r){
       if(r=='I'){
           return 1;
   }
   if(r=='V'){
           return 5;
   }
   if(r=='X'){
           return 10;
   }
   if(r=='L'){
           return 50;
   }
   if(r=='C'){
           return 100;
   }
   if(r=='D'){
           return 500;
   }
   if(r=='M'){
           return 1000;
   }
   return -1;
   }
    public static void main(String []args){
        String s="XIV";
        int result=0;
        for(int i=0;i<s.length();i++){
            int val1=value(s.charAt(i));
        
        if(i+1<s.length()){
            int val2=value(s.charAt(i+1));
            if(val1<val2){
                result-=val1;
            }   
            else{
                result+=val1;
            }
        }
        else{
            result+=val1;
        }
            
            
        }System.out.print(result);
        
    }
}

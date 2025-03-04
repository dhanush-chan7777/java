public class PalindromeBuildin{
    public static void main(String []args){
        String s="MALAYALAM";
        StringBuffer str=new StringBuffer(s);
        String P=str.reverse().toString();
         if(s.equals(P)){
            System.out.print("its a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
    }
}

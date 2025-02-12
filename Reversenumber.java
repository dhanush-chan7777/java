public class Reversenumber{
    public static void main(String[] args){
        
        int num=12345;
        String number=Integer.toString(num);
        
        for(int i=number.length()-1;i>=0;i--){
            System.out.print(number.charAt(i));
        }
    }
}

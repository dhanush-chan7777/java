import java.util.Scanner;
public class Primeornot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        
        if (num <= 1) {
            System.out.println("It's not a prime number");
            return;
        }
        
        int num2 = 0;
        for (int i = 2; i <= num/ 2; i++) {
            if (num % i == 0) {
                num2 = 1;
                break;
            }
        }
        
        if (num2 == 0) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("It's not a prime number");
        }
    }
}

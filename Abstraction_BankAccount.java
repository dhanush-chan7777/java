import java.util.*;

abstract class BankAccount{
    private int accountNumber;
    private double balance;
    static double intrestRate = 5, intrest=0;
    
    public BankAccount(){
        Scanner input = new Scanner(System.in);
        this.accountNumber = input.nextInt();
        this.balance = input.nextDouble();
    }
    
    public double get_balance(){
        return balance;
    }
    
    public double get_intrestRate(){
        return intrestRate;
    }
    
    abstract double calculateInterest();
    
    void display(){
        System.out.println("\nAccount No: "+accountNumber+"\nBalance: "+balance+
        "\nIntrest: "+intrest);
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(){
        super();
    }
    
    double calculateInterest(){
        intrest = (double)((super.get_balance()*super.get_intrestRate()*10)/100);
        return intrest;
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(){
        super();
    }
    
    double calculateInterest(){
        intrest = (double)((super.get_balance()*super.get_intrestRate()*5)/100);
        return intrest;
    }
}

public class Abstraction_BankAccount
{
	public static void main(String[] args) {
	    
	    SavingsAccount s = new SavingsAccount();
	    s.calculateInterest();
	    s.display();
	    CurrentAccount c = new CurrentAccount();
	    c.calculateInterest();
	    c.display();
	}
}
   

/** SavingsAccount 
 * @author (Fikri Şan Köktaş)
 * @version (28 April 2021) */
import java.util.Scanner;
public class SavingsAccount 
{
    private double balance;
    public double addInterest;
    public double interest;
    public SavingsAccount()
    {
        balance = 0;
    }
    public SavingsAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public void withdraw(double amount) 
    {
        balance = balance - amount;
    }
    public double getBalance()
    {
        return balance;
    }
    public void addInterest(double rate) 
    {
        balance += balance * (addInterest/10);
        balance = getBalance();
    }
}
class SavingsAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount firstAccount = new SavingsAccount(1000);
        firstAccount.addInterest(10);
        System.out.println(firstAccount.getBalance());
        System.out.println("Expected: 1100");  
        
        SavingsAccount secondAccount = new SavingsAccount(5000);
        secondAccount.addInterest(12.5);
        System.out.println(secondAccount.getBalance());
        System.out.println("Expected: 5625");  
    } 
}

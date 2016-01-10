package Bank;

/**
 * Created by Jeffrey on 1/9/16.
 */
public class BankMain
{
    public static void main(String[] args)
    {
        // Create cust1
        Account cust1 = new Account(); // Create an account object
        cust1.deposit(500);

        // Create cust2
        Account cust2 = new Account();
        cust2.deposit(100);
        cust2.withdraw(400);

        System.out.println("Cust1 Balance is " + cust1.getBalance());
        System.out.println("Cust2 Balance is " + cust2.getBalance());
    }
}

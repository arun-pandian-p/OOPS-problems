import java.util.Scanner;
class BankAccount{
    String account_holder;
    long account_number;
    double account_balance;

    void deposit(double amount)
    {
        account_balance=account_balance+amount;
        System.out.println("Deposit amount Successfully");
        System.out.println("Account Balance is: "+account_balance);

    }
    void withdraw(double amount)
    {
        account_balance=account_balance-amount;
        System.out.println("Withdraw amount Successfully");
        System.out.println("Account Balance is: "+account_balance);

    }
}

public class Banksys {
    public static void main(String[]args)
    {
    BankAccount b1=new BankAccount();
    Scanner sc=new Scanner(System.in);
    b1.account_holder="Arun";
    b1.account_number=1001;
    b1.account_balance=5000;
     b1.deposit(100);
     b1.withdraw(200);
    }
}

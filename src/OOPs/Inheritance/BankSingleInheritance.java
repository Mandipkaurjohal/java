package OOPs.Inheritance;

import java.util.Scanner;

public class BankSingleInheritance {
    String accountNumber;
    String AccountHolderName;
    Double balance;
   // Double totalBalance;


    public BankSingleInheritance() {
    }

    public BankSingleInheritance(String accountNumber, String accountHolderName, Double balance) {
        this.accountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        this.balance = balance;
    }

    Scanner scanner=new Scanner(System.in);
    public  void deposit()
    {
        System.out.println("Enter your deposit amount");
    double deposit=scanner.nextDouble();
        balance =balance+deposit;
        System.out.println("balance  "+balance);
    }
    public void widhdraw()
    {

        System.out.println("Enter amount for withdraw  ");
        double amount =scanner.nextDouble();
        if(balance>=amount)
        {
            balance=balance-amount;
        }
         else {
            System.out.println("insufficient balance");
        }
        //System.out.println("Remaning balance is  " + totalBalance);
    }
    public void AccountInfo(){
        System.out.println("Name of Account holder : " +AccountHolderName);
        System.out.println("Account number :" + accountNumber);
        System.out.println("Total Balance : " +balance);

    }
}

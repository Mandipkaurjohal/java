package Exception;

import java.util.Scanner;

public class throwExceptionBank  {
   Scanner scanner=new Scanner(System.in);
   static   String accountNumber;
   static String pin;
    static double balance;





    public throwExceptionBank(String accountNumber, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

            public double deposit()
            {

                System.out.println("Enter you deposite ammount");
                double deposit= scanner.nextDouble();

                balance=balance+deposit;
                return +balance;
            }


    public double withdraw() {
        double withdraw;
        System.out.println("Enter how much would you like to withdraw");
        withdraw = scanner.nextDouble();
        if (balance < withdraw) {
            throw new throwCreateExceptionBank("insufficiant balance");
        } else {
            balance = withdraw - balance;
            return balance;
        }
    }
    public double balance()
    {
         return balance;
    }
}


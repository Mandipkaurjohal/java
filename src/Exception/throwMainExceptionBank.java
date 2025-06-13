package Exception;

import java.util.Scanner;

import static Exception.throwExceptionBank.accountNumber;
import static Exception.throwExceptionBank.pin;


public class throwMainExceptionBank {
   static String UserAccount;
   static String UserPin;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        throwExceptionBank throwExceptionBank=new throwExceptionBank("1234",50000,"156");

        System.out.println("Enter your account number " );
        UserAccount=scanner.nextLine();
        System.out.println("Enter your pin number " );
        UserPin =scanner.nextLine();


            if (accountNumber.equalsIgnoreCase( UserAccount)&& pin.equalsIgnoreCase(UserPin))
            {
                System.out.println("you are allowed to do operation");
                System.out.println("Enter your choice ");

                System.out.println("1. Deposit");
                System.out.println("2. WithDraw");
                System.out.println("3. Balance");
                int choice = scanner.nextInt();
                if (choice==1)
                {
                    System.out.println("Your Total Balance is "+throwExceptionBank.deposit());

                }

                else if (choice==2)
                {
                    System.out.println("Your Total Balance is "+throwExceptionBank.withdraw());
                }
                else if (choice==3)
                {
                    System.out.println("Your Total Balance is "+throwExceptionBank.balance());
                }




        }

    }

}

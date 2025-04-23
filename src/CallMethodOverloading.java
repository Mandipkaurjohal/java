import java.util.Scanner;

public class CallMethodOverloading {
public static void main(String args[])
{
    MethodOverloading methodOverloading = new MethodOverloading();
    Scanner scanner =new Scanner(System.in);
    int option;
    System.out.println("Choose  your option  from 1 ,2 or 3");
    option  =scanner.nextInt();

    int a ;

    int b ;
    int c ;
    int d ;





    switch (option)
    {
        case 1:
            System.out.println("Enter your first number ");
            a=scanner.nextInt();
            System.out.println("Enter your second number");
            b=scanner.nextInt();


            System.out.println("Result is = " +methodOverloading.multipilaction(a, b));
            break;
        case 2:
            System.out.println("Enter your first number ");
            a=scanner.nextInt();
            System.out.println("Enter your second number ");
            b=scanner.nextInt();
            System.out.println("Enter your third number ");
            c=scanner.nextInt();

            System.out.println("Result is = " +methodOverloading.multipilaction(a, b, c));
            break;
        case 3:
            System.out.println("Enter your first number ");
            a=scanner.nextInt();
            System.out.println("Enter your second number ");
            b=scanner.nextInt();
            System.out.println("Enter your third number");
            c=scanner.nextInt();
            System.out.println("Enter your forth number");
            d=scanner.nextInt();

            System.out.println("Result is = " +methodOverloading.multipilaction(a, b, c, d));
            break;
        default:
            System.out.println("wrong value, EXIT");
    }



}
}

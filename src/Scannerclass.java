
import java.util.Scanner;

public class Scannerclass {
    public static void main(String args[])


        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number");
            int x= scanner.nextInt();

            System.out.println("Enter the second number");
            int y = scanner.nextInt();

            int sum= x+y;
            System.out.println("total is"+sum);

            System.out.println("enter the name");
String name= scanner.next();
            System.out.println("name is    " + name);




        }
}

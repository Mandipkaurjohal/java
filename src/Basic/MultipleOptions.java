package Basic;

import java.util.Scanner;

public class MultipleOptions {
    public static void main(String args[])
    {
        System.out.println("*****************");
        System.out.println("welcome to my computer");
        System.out.println("*****************");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Dvision");
        System.out.println("4: multipilaction");
        System.out.println("5: Modulos");
        System.out.println("0: Exit");
        System.out.println();
        System.out.println();
        System.out.println("Select  your option ");
        Scanner scanner =new Scanner(System.in);
        String option=scanner.nextLine();
        boolean continoueProgram=true;



while(continoueProgram==true)
{

    System.out.println("Enter your first value");

    int value1=scanner.nextInt();
    System.out.println("Enter your second value");
    int value2=scanner.nextInt();
        switch(option) {


            case "sunday":

                int add = value1 + value2;
                System.out.println("Addition is " + add);
                break;

            case "monday":

                int sub = value1 - value2;
                System.out.println("Subtraction is " + sub);
                break;


            case "tuesday":

                int div = value1 / value2;
                System.out.println("division " + div);
                break;

            case "wednesday":

                int mul = value1 * value2;
                System.out.println("multipilaction is" + mul);
                break;

            case "friday":

                int mod = value1 % value2;
                System.out.println("modulous is " + mod);
                break;

            default:
                System.out.println("invalid option");
        }
                System.out.println("do you want to continue (yes/no)");
                 //continoueProgram=scanner.nextBoolean();
                 String userInput=scanner.next();
                 continoueProgram=userInput.equalsIgnoreCase("yes");



                 if (continoueProgram==true)
                 {
                     System.out.println("*****************");
                     System.out.println("welcome to my computer");
                     System.out.println("*****************");
                     System.out.println("1: Addition");
                     System.out.println("2: Substraction");
                     System.out.println("3: Dvision");
                     System.out.println("4: multipilaction");
                     System.out.println("5: Modulos");
                     System.out.println("0: Exit");
                     System.out.println();
                     System.out.println();
                     System.out.println("Select your option");
                     option=scanner.nextLine();

                 }
                 else
                 {
                     scanner.close();
                     System.out.println("Exit");
                 }


                    }

                }
}





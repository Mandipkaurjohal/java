package Basic;

import java.util.Scanner;

public class CallMethodCalculator {

        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);




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

            System.out.println("select the menu = ");
            int x=scanner.nextInt();
            System.out.println("enter the first value = ");
             int a = scanner.nextInt();
            System.out.println("enter the second value");
            int b= scanner.nextInt();

            ArimathicDemo ari =new ArimathicDemo();


        switch (x)
        {
            case 1:

 //a= scanner.nextInt();

                 //a= scanner.nextInt();
                System.out.println("Total is "+ ari.sum(a, b));
                break;
             //   System.out.println(sum);


           /* case 2:
                float sub=a-b;
                System.out.println("Subtraction is"+ sub);
                break;
            case 3:
                float div=a/b;
                System.out.println("division"+div);
                break;
            case 4:
                float multi=a*b;
                System.out.println("multipilicatio is"+ multi);
                break;
            case 5:
                float modl=a%b;
                System.out.println("modulous is"+ modl);*/

            default:

                System.out.println("exit");
        }

        }

    }












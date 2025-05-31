package Basic;

import java.util.Scanner;

public class DoWhileLoop
{
    public static void main(String[] args) {
        int sum=0;
        int EvenSum=0;
        int oddSum=0;
        int FirstNumber=0;
        System.out.println("Enter your number   = ");

        Scanner scanner=new Scanner(System.in);
        int UserNumber = scanner.nextInt();




        do {
            sum = FirstNumber + sum;

            if (FirstNumber % 2 == 0) {
                EvenSum=FirstNumber+EvenSum;


            } else {

                oddSum=FirstNumber+oddSum;

            }
            FirstNumber++;

        }
            while(FirstNumber<=UserNumber );



        System.out.println("Sum = "+sum);
        System.out.println("Sum of Odd Number is = " + oddSum);
        System.out.println("Sum os Even Number is = " + EvenSum);


    }
}



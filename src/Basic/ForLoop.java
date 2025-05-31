package Basic;

import java.util.Scanner;

public class ForLoop {
    public static void main(String args[])
    {
        System.out.println("Enter your number = ");
        Scanner scanner=new Scanner(System.in);
        int userNumber= scanner.nextInt();
        int firstNumber;
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        for(firstNumber=0;firstNumber<=userNumber;firstNumber++)
        {
            sum=firstNumber+sum;
            if(firstNumber%2==0)
            {
                evenSum=evenSum+firstNumber;
            }
            else
            {
                oddSum=oddSum+firstNumber;
            }

        }
        System.out.println("sum is " + sum);
        System.out.println("even is " + evenSum);
        System.out.println("odd is " + oddSum);

    }
}

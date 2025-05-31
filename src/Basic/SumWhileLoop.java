package Basic;

import java.util.Scanner;

public class SumWhileLoop {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your Starting  number will be 0 bydefault");
        int firstNumber=0;

        System.out.println("Enter the last number of series that you want sum ");
        int lastNumber=scanner.nextInt();
        int sum = 0;
        while (firstNumber<=lastNumber) {

            sum = firstNumber + sum;
            ++firstNumber;
        }
            System.out.println(sum);


    }
}

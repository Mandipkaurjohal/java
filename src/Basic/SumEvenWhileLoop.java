package Basic;

import java.util.Scanner;

public class SumEvenWhileLoop {
    public static void main(String[] args) {

        System.out.println("Enter your number = ");
        Scanner scanner = new Scanner(System.in);
        int UserNumber = scanner.nextInt();
        int firstNumber = 0;
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;
        while (firstNumber<=UserNumber) {
            sum = firstNumber + sum;

            if (firstNumber % 2 == 0) {
                evenSum = evenSum + firstNumber;
            } else {
                oddSum = oddSum + firstNumber;
            }
            firstNumber++;        }
            System.out.println("Total of numbers is = "+sum);
            System.out.println("Total of even numbers is = "+evenSum);
            System.out.println("Total of odd numbers is = "+oddSum);

    }

    }


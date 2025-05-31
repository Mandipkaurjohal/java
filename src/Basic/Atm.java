package Basic;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("INSERT CARD");
        System.out.println("************");
        System.out.println("ENTER YOU PIN");

        System.out.println(" SELECT MENU");
        System.out.println("1. WIDHDRAW  ");
        System.out.println("2. BALANCE INQUIRY");
        System.out.println("3. TRANSFER MONEY");
        System.out.println("Enter the menu ");
        int menu= scanner.nextInt();
        System.out.println("YOU HAVE SELECTED MENU "+menu);
        switch(menu)
        {
            case 1:
                System.out.println("you have requested for widhdraw");
           break;
            case 2:
                System.out.println("you have requested for balance inquiry ");
            break;
                case 3:
                System.out.println("you have requested for transfer money");
                break;
            default:
                System.out.println("invalid value");
        }

        }
        {
    }
}

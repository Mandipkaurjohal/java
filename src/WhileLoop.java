import java.util.Scanner;

public class WhileLoop
{
    public static void main(String args[])
    {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your  starting number = ");
        int FirstNumber =scanner.nextInt();

        System.out.println("Enter your last number ");
        int Lastnumber=scanner.nextInt();
        //int printNumber= Firstnumber;

        while(FirstNumber<=Lastnumber)
        {
            System.out.println(FirstNumber);
            FirstNumber++;
        }
    }
}

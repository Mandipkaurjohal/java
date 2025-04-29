import java.util.Scanner;

public class Array1 {
   static Scanner scanner=new Scanner(System.in);
    static int[] a={10,15,16,15};
    static int[]b=new int[5];
    public static void hello()
    {
        System.out.println(a[2]);
    }
    public static void you()
    {
        for (int i = 0; i < b.length ; i++) {
            System.out.println("enter your number");
            b[i]=scanner.nextInt();
            System.out.println("your num is "+b[i]);
        }

    }

    public static void main(String[] args) {
        {
            Array1.hello();
            Array1.you();
        }
    }
}

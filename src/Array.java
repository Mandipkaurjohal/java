import java.util.Scanner;
public class Array {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr = {10, 20, 30, 40, 50};
    static int[] ar = new int[5];

    public static void hello() {
        System.out.println(arr[0]);
    }

       public void fo() {
        for (int i = 0; i < ar.length; i++) {
            System.out.println("enter your value");
            ar[i] = scanner.nextInt();
            System.out.println("your value is "+ar[i]);
        }

    }

    public static void main(String[] args)
    {
        Array array=new Array();
        Array.hello();
        array.fo();

    }
}

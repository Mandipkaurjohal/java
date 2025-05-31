package OOPs.Encapsulation;

import java.util.Scanner;

public class TestFilePermissionEncapsulattion {
    public static void main(String[] args) {
        System.out.println("Enter you permission 1 for write");
        System.out.println("Enter you permission 2 for read");
        System.out.println("Enter you permission 3 for read and write");
        int choice;
        System.out.println("Enter you choice");
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();
        scanner.nextLine();
        FilePermissionEncapsulation filePermissionEncapsulation=new FilePermissionEncapsulation("hello how are you",choice);

        if (choice==1||choice==3)
        {

            System.out.println("Enter you data");

            String newdata=scanner.nextLine();

             filePermissionEncapsulation.setData(newdata);

        }
        else if (choice==2)
        {
            System.out.println(filePermissionEncapsulation.getData());
        }
        else {
            System.out.println("enter valid choice");

        }
        scanner.close();
    }

}

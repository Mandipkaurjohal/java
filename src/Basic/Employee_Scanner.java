package Basic;

import java.util.Scanner;

public class Employee_Scanner {
    int id;
    String name;
    static String company= "home";
    Scanner scanner=new Scanner(System.in);

   public  void description()
    {
       // System.out.println("enter id : "+ (id = scanner.nextInt()));
        System.out.println("enter id ");
        id= scanner.nextInt();

       System.out.println("enter name ");
       name=scanner.next();
       //System.out.println("enter name : " +(name = scanner.next()));


        System.out.println("company name is :" + company);

    }



    }


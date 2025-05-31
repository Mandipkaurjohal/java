package OOPs.Encapsulation;

import java.util.Scanner;

public class FilePermissionEncapsulation {
    private String data;
private  int permission;//write =1 ,read =2, read and write =3;

    public FilePermissionEncapsulation(String data, int permission) {
        this.data = data;
        this.permission = permission;
    }

    public FilePermissionEncapsulation(int permission) {
        this.permission = permission;
    }
    public void setData(String data) {
        if (permission==1||permission==3)
        {
        this.data = data;
            Scanner scanner=new Scanner(System.in);
            System.out.println("you have permission to write data enter your data");
            System.out.println(data);
            String newData=scanner.nextLine();
              newData=newData+data;
            //data=scanner.nextLine();
    }
        else {
            System.out.println("you don not have permission to write data");
        }}
    public String getData() {
        if (permission == 2 || permission == 3) {
            return data;
        } else {
            return "You do not have permission to read data.";
        }

    }
    }

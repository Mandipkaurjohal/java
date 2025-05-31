package OOPs.Encapsulation;

public class EncapsulationGetterSetter {
String userName;
String password;

    public EncapsulationGetterSetter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public  String getUserName()
    {
        return userName;

    }
    public String getPassword()
    {
        return  password;
    }
    public String setPassword(String password)
    {

        this.password=password;
        return password;

    }
    public void isValidUser(String userName,String password)
    {
        if (this.userName.equalsIgnoreCase(userName)&&this.password.equalsIgnoreCase(password))
        {
            System.out.println("Valid user");
        }
        else {
            System.out.println("invalid credentials. please try again");
        }
    }
}


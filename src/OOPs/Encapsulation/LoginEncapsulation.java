package OOPs.Encapsulation;

public class LoginEncapsulation {
        String username;
     String password;

    public LoginEncapsulation(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

   /* public String getPassword() {
        return password;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }
    public void  isValid( String username,String password)
    {
        if (username.equalsIgnoreCase(this.username) && password.equalsIgnoreCase(this.password))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}

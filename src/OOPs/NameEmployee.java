package OOPs;

public class NameEmployee {
   private String FirstName;
    private String MiddleName;
    private String LastName;

    public NameEmployee(String firstName, String middleName, String lastName) {
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
    }


    @Override
    public String toString() {
        return "NameEmployee{" +
                "FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}

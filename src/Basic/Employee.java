package Basic;

public class Employee {
    int id;
    String emp_name;
    static String company="home" ;

    public Employee(int id, String emp_name) {
        this.id = id;
        this.emp_name = emp_name;
    }
    public void  description()
    {
        System.out.println("Employee id is : " +id);
        System.out.println("Employee name : " +emp_name);
        System.out.println("Employee company : " +company);
    }
}

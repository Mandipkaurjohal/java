package OOPs.Composiotion;

import OOPs.NameEmployee;

public class MainEmployee {
    public static void main(String[] args) {
        NameEmployee nameEmployee=new NameEmployee("Mnadip","kaur","johal");
        Employee employee=new Employee(nameEmployee,"100 Toronto",10000.00,"012345674");
        System.out.println("Name of employee is "+employee.getName());
        System.out.println("Address of Employee is "+employee.getAddress());

        System.out.println("Salary of employee is " +employee.getSalary());
        System.out.println("Phone number of employee is "+employee.getPhoneNumber());
    }
}

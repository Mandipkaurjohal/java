package OOPs.Composiotion;

import OOPs.NameEmployee;

public class Employee {
    private NameEmployee Name;
    private String Address;
    private double Salary;
    private String PhoneNumber;


    public Employee(NameEmployee name, String address, double salary, String phoneNumber) {
        Name = name;
        Address = address;
        Salary = salary;
        PhoneNumber = phoneNumber;
    }

    public NameEmployee getName() {
        return Name;
    }

    public void setName(NameEmployee name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}

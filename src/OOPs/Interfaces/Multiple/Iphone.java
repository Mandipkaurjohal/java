package OOPs.Interfaces.Multiple;

public class Iphone extends  SmartPhone {

    public  void iphone()
    {

        System.out.println("it is iphone");
    }
    @Override
    public void calculator() {
        System.out.println("iphone has calculator");
    }

    @Override
    public void Camera() {
        System.out.println("iphone has camera");
    }

    @Override
    public void Clock() {
        System.out.println("iphone has clock");
    }

    @Override
    public void musicPlayer() {
        System.out.println("iphone has musicPlayer");
    }

    @Override
    public void telephone() {
        System.out.println("iphone has telephone");
    }

}

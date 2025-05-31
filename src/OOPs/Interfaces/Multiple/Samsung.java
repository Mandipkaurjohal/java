package OOPs.Interfaces.Multiple;

public  class   Samsung extends SmartPhone{
    @Override
    public void calculator() {
        System.out.println("it has calculator");
    }

    @Override
    public void Camera() {
        System.out.println("samsung has camera");
    }

    @Override
    public void Clock() {
        System.out.println("samsung has clock");
    }

    @Override
    public void musicPlayer() {
        System.out.println("samsung has musicplayer");
    }

    @Override
    public void telephone() {
        System.out.println("samsung has telephone");
    }
     public void helloSamsung()
     {
         System.out.println("hello samsung");
     }
}

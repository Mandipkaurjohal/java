package OOPs.Interfaces.Multiple;

public class MainMultiple {
    public static void main(String[] args) {
        SmartPhone smartPhone=new Samsung() ;


        SmartPhone samsung=new Samsung ();
        System.out.println(" Samsung class");
        samsung.calculator();
        samsung.Camera();
        samsung.musicPlayer();
        samsung.Clock();
        samsung.telephone();
        ((Samsung) samsung ).helloSamsung();

        System.out.println("Iphone");
        System.out.println("       ");
        Iphone iphone=new Iphone();
        iphone.calculator();
        iphone.Camera();
        iphone.iphone();
        iphone.Clock();
        iphone.musicPlayer();
        iphone.telephone();


        System.out.println("it is ipad");
        System.out.println("           ");
        Ipad ipad=new Ipad();
        ipad.calculator();
        ipad.Camera();
        ipad.Clock();
        ipad.musicPlayer();
        ipad.telephone();

    }
}

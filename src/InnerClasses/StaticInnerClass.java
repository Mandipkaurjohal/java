package InnerClasses;

public class StaticInnerClass {
    public void computer()
    {
        System.out.println("This is  computer");
    }
    static class MotherBoard
    {
        public void innerComputer()
        {
            System.out.println("this is inner class computer");
        }
    }
}

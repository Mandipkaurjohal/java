package Basic;

public class StaticBlock {
    static
    {
        System.out.println("static block");
    }
    {
        System.out.println("static instance");
    }
    StaticBlock()
    {
        System.out.println("constructor");
    }
    public static void  show()
    {
        System.out.println("static method");
    }
    public void method()
    {
        System.out.println("normal metod");

    }

    public static void main(String[] args) {
        StaticBlock.show();
        new StaticBlock();


    }
}

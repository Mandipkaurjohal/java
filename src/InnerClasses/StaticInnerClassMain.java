package InnerClasses;

public class StaticInnerClassMain
{
    public static void main(String[] args) {
         StaticInnerClass staticInnerClass=new StaticInnerClass();
         staticInnerClass.computer();

        StaticInnerClass.MotherBoard motherBoard=new StaticInnerClass.MotherBoard();

        motherBoard.innerComputer();

    }
}

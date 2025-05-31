package OOPs.Polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        SquarePolymorphism squarePolymorphism=new SquarePolymorphism();
        //System.out.println(squarePolymorphism.shapes());
         System.out.println("Area of square is "+squarePolymorphism.shapes());
        RectanglePolymorphism rectanglePolymorphism=new RectanglePolymorphism();
        System.out.println("Area of rectuangle is "+rectanglePolymorphism.shapes());


    }


}

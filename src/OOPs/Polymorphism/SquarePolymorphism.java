package OOPs.Polymorphism;

public class SquarePolymorphism  extends ShapesPolymorphism{
    @Override
    double shapes() {
          side=10;
         area =side * side;
         return area;

    }
}


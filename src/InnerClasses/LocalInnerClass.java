package InnerClasses;

public class LocalInnerClass {
    public void method()
    {
        System.out.println("this is ousideMethod");
         class InsideClass
        {
            public void insideMethod()
            {
                System.out.println("this is insideMethod");
            }
        }
        InsideClass insideClass=new InsideClass();
         insideClass.insideMethod();
    }
}

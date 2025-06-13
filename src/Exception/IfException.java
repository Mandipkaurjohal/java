package Exception;

public class IfException {
    public void divide()
    {
        try {
            int a=10;
                    int b=0;
            int d=a/b;
            if (a==5)
            {
                System.out.println(d);
            }

        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();// to print what is exception
        }
        finally {
            System.out.println("Execute always");
        }
        System.out.println("hello");


    }

}

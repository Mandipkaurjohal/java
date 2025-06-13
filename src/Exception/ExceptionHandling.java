package Exception;

public class ExceptionHandling {
    public void exception()   {

            for (int i = 0; i <10; i++) {
                try {

                System.out.println("hello");
                 Thread.sleep(1000);

        } catch (InterruptedException e) {
                    e.printStackTrace();
            //throw new RuntimeException(e);
        }
       // System.out.println(i);
        }
    }
}

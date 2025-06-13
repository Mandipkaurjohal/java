package InnerClasses;

public class AnonymousMain {
    public static void main(String[] args) {
//        AnonymousInterface anonymousInterface=new AnonymousClass();
//anonymousInterface.hindi();
//anonymousInterface.english();
        AnonymousInterface anonymousInterface=new AnonymousInterface ()
        {
            @Override
            public void hindi() {
                System.out.println("this is hindi class");
            }

            @Override
            public void english() {
                System.out.println("this is english class");

            }
        };
        anonymousInterface.english();
        anonymousInterface.hindi();

    }
}

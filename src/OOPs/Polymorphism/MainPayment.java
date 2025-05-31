package OOPs.Polymorphism;

public class MainPayment {
    public static void main(String[] args) {
        Payment creditPayment=new CreditPayment();
         creditPayment.makePayment();
         PayPalPayment payPalPayment=new PayPalPayment();
         payPalPayment.makePayment();
         UpiPayment upiPayment=new UpiPayment();
         upiPayment.makePayment();
         InteractPayment interactPayment=new InteractPayment();
         interactPayment.makePayment();

    }
}

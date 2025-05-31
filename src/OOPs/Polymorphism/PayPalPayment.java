package OOPs.Polymorphism;

public class PayPalPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("make payment with paypal");
    }
}

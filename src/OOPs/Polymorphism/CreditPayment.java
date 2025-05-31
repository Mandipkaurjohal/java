package OOPs.Polymorphism;

public class CreditPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("make payment with credit card");
    }
}

package OOPs.Polymorphism;

public class UpiPayment extends Payment{
    @Override
    public void makePayment() {
        System.out.println("make payment with UpiPayment");
    }
}

package OOPs.Interfaces.Bank;

public class BmoBankIntereface implements Bank {
   double InterestRate;

    public BmoBankIntereface(double interestRate) {
        InterestRate = interestRate;
    }

    @Override
    public double getRateOfInterest() {
        return primeRate+InterestRate;
    }
}

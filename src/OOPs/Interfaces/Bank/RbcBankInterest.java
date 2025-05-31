package OOPs.Interfaces.Bank;

public class RbcBankInterest implements Bank {
    double InterstRate;

    public RbcBankInterest(double interstRate) {
        InterstRate = interstRate;
    }

    @Override
    public double getRateOfInterest() {

         return InterstRate+primeRate;
    }

}

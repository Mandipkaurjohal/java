package OOPs.Interfaces.Bank;

public class ScotiaBankInterfaces implements Bank {
    double InterestRate;

    public ScotiaBankInterfaces(double interestRate) {
        InterestRate = interestRate;
    }

    @Override
    public double getRateOfInterest() {

        return InterestRate+primeRate;
        //System.out.println("Prime rate of ScotiaBankInterfaces bank is " + InterestRate);

    }
}

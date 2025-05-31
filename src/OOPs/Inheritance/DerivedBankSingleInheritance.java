package OOPs.Inheritance;

public class DerivedBankSingleInheritance extends BankSingleInheritance {
    double interestRate;

    public DerivedBankSingleInheritance(String accountNumber, String accountHolderName, Double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }
    public double IntrestRate()
    {
        return balance*interestRate;
    }

    @Override
    public void AccountInfo() {
        super.AccountInfo();
        System.out.println("Interest Earned : "+ IntrestRate());
    }
}

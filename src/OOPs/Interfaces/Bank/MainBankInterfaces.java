package OOPs.Interfaces.Bank;

public class MainBankInterfaces {
    public static void main(String[] args) {
        Bank bank=new ScotiaBankInterfaces(2.5);
        System.out.println("InterstRate of Scotia Bank is "+bank.getRateOfInterest());
        bank=new RbcBankInterest(2.7);
        System.out.println("InterstRate of Rbc Bank is " +bank.getRateOfInterest());
        bank =new BmoBankIntereface(3.5);
        System.out.println("InterstRate of Rbc Bank is " +bank.getRateOfInterest());
    }
}

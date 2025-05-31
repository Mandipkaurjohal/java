package OOPs.Inheritance;

public class MainBankSingleInheritance {
    public static void main(String[] args) {
       // BankSingleInheritance bankSingleInheritance=new BankSingleInheritance("1234","Mandip",0.0);
       // bankSingleInheritance.deposit();
        DerivedBankSingleInheritance derivedBankSingleInheritance=new DerivedBankSingleInheritance("1234","Mandip",1254.0,4.34);
    derivedBankSingleInheritance.deposit();
    derivedBankSingleInheritance.widhdraw();

        derivedBankSingleInheritance.AccountInfo();
    }}

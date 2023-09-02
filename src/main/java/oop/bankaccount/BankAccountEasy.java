package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0);
    }

    @Override
    public double withdraw(double amount) {
        double allowed = Math.min(amount,balance);
        return super.withdraw(allowed);
    }

    @Override
    public double transfer(BankAccount account,double amount) {
        String dst = account.getIBAN().substring(0,2);
        String origin = IBAN.substring(0,2);
        if (dst.equals(origin)) {
           double allowed =  withdraw(amount);
            account.deposit(allowed);
            return allowed;
        } else {
            throw new IllegalArgumentException("International transfer not permitted");
        }
    }

}

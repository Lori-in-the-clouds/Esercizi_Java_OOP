package oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount {
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance,0.02, 1);
    }

    @Override
    public void deposit (double amount) {
        this.balance+=amount;
        applyFee();
    }

    @Override
    public double withdraw(double amount) {
        this.balance-=amount;
        applyFee();
        return balance;

    }
}

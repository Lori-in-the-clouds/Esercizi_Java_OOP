package oop.bankaccount;

abstract class AbstractBankAccount implements BankAccount {
    String IBAN;
    double balance;
    double interestRate;
    double operationFee;

    public AbstractBankAccount(String IBAN, double balance, double interestRate, double operationFee) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.interestRate = interestRate;
        this.operationFee = operationFee;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(double operationFee) {
        this.operationFee = operationFee;
    }
    public double withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    public void addInterest() {
        balance+= balance*interestRate;
    }

    public void deposit(double deposit) {
        balance+=deposit;
    }

    public double transfer(BankAccount account,double amount) {
        withdraw(amount);
        account.deposit(amount);
        return amount;
    }

    public void applyFee() {
        balance-= operationFee;
    }

    public void checkIBAN(String IBAN) {
        if (IBAN.length() < 8 || IBAN.length() > 34) {
            throw new IllegalArgumentException("Invalid length");
        }
        String countryCode = IBAN.substring(0, 2);
        if (!(Character.isUpperCase(countryCode.charAt(0)) && Character.isUpperCase(countryCode.charAt(1)))) {
            throw new IllegalArgumentException("Invalid country code");
        }
    }



}

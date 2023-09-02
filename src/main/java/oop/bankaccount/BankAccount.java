package oop.bankaccount;

public interface BankAccount {
    double getBalance();
    String getIBAN();
    double getInterestRate();
    double getOperationFee();
    void setBalance(double amount);


    void setIBAN(String string);

    void setInterestRate(double interestRate);
    void setOperationFee(double  operationFee);

    void deposit(double deposit);

    double transfer(BankAccount account,double amount);
    double withdraw(double amount);

    void applyFee();

    void checkIBAN(String IBAN);

    void addInterest();



}

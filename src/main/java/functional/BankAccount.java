package functional;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDateTime duePayment) {
            this.duePayment = duePayment;
        }
    }
    public static List<Account> applyInterest(List<Account> accounts) {
        return (List<Account>) accounts.stream()
                .filter((Account t1) -> t1.getDuePayment().isBefore(LocalDateTime.now()))
                .map((Account a1) -> BankAccount.add_interest(a1))
                .sorted(new Comparator<Account>() {
                    @Override
                    public int compare(Account t1, Account t2) {
                        return (int)t2.amount-(int)t1.amount;
                    }
                }).collect(Collectors.toList());
    }

    public static Account add_interest (Account a1) {
        double moment_amount =  a1.getAmount();
        moment_amount+= moment_amount*a1.getInterestRate();
        a1.setAmount(moment_amount);
        return a1;
    }
}

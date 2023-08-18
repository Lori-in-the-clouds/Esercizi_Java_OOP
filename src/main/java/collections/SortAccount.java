package collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class SortAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

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

        public LocalDate getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDate duePayment) {
            this.duePayment = duePayment;
        }

        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }


    }
    public static void sortByAmount(List<Account> accounts) {
      accounts.sort(new Comparator<Account>() {
          @Override
          public int compare(Account t1, Account t2) {
                return (int)Double.compare(t1.getAmount(),t2.getAmount());
          }
      });
    }
    public static void sortByInterestRate(List<Account> accounts) {
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account t1, Account t2) {
                return (int)Double.compare(t1.getInterestRate(),t2.getInterestRate());
            }
        });
    }
    public static void sortByDuePayment(List<Account> accounts) {
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account t1, Account t2) {
                return t1.getDuePayment().compareTo(t2.getDuePayment());
            }
        });
    }
}

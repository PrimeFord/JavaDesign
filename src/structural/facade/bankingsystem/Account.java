package structural.facade.bankingsystem;

class Account {
    private double balance = 100.0;

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
//        balance += amount;
        balance = balance + amount;
    }

    boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }


}
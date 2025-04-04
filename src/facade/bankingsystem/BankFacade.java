package facade.bankingsystem;


class BankFacade {
    private Account account;
    private Security security;
    private TransactionLogger transactionLogger;

    public BankFacade() {
        this.account = new Account();
        this.security = new Security();
        this.transactionLogger = new TransactionLogger();
    }

    void checkBalance(){
        System.out.println("Your account balance is: " + account.getBalance());
        account.getBalance();
    }

    void deposit(double amount) {
        account.deposit(amount);
        System.out.println("You deposited "+ amount + "Your account balance is: " + account.getBalance());
    }

    void withdraw(double amount) {
        account.withdraw(amount);
        System.out.println("You withdrawed "+ amount + "Your account balance is: " + account.getBalance());
    }
}

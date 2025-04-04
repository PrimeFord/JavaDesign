package facade.bankingsystem;

public class BankingFacade {
        public static void main(String[] args) {
            BankFacade bankingSystem = new BankFacade();

            bankingSystem.checkBalance();
            bankingSystem.withdraw(20);
            bankingSystem.deposit(500);
        }
}

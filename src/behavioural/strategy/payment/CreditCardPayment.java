package behavioural.strategy.payment;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid £" + amount + " using credit card");
    }
}

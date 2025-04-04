package behavioural.strategy;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid £" + amount + " using credit card");
    }
}

class PaypalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid £" + amount + " using Paypal");
    }
}

class ShoppingCart{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy( PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}


public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        cart.setPaymentStrategy(new PaypalPayment());
        cart.checkout(200);
    }
}

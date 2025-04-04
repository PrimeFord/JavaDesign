package behavioural.strategy.payment;

public class PaymentMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(150);

        cart.setPaymentStrategy(new PaypalPayment());
        cart.checkout(250);
    }
}

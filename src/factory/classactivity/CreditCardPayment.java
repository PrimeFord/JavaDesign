package factory.classactivity;


class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment £:" +amount);
    }
}

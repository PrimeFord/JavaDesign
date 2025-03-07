package PaymentPattern;

interface Payment{
    void processPayment();
}

class CreditCard implements PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your Credit Card details");
    }
}

class PayPal implements PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your PayPal Payment details");
    }
}
class GooglePay implements PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your Google Payment details");
    }
}
class ApplePay implements PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your Apple Payment details");
    }
}
package creational.PaymentPattern;

interface Payment{
    void processPayment();
}

class CreditCard implements creational.PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your Credit Card details");
    }
}

class PayPal implements creational.PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your PayPal Payment details");
    }
}
class GooglePay implements creational.PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your Google Payment details");
    }
}
class ApplePay implements creational.PaymentPattern.Payment {
    public void processPayment() {
        System.out.println("Add your Apple Payment details");
    }
}
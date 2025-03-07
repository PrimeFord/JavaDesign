package PaymentPattern;

class PaymentFactory {
    public Payment processPayment(String paymentType) {
        if (paymentType == null) {
            System.out.println("Error: Payment type cannot be null.");
            return null;
        }

        return switch (paymentType.toLowerCase()) { // Ensuring case insensitivity
            case "credit card" -> new CreditCard();
            case "paypal" -> new PayPal();
            case "google pay" -> new GooglePay();
            case "apple pay" -> new ApplePay();
            default -> {
                System.out.println("Error: Unknown payment type '" + paymentType + "'");
                yield null;
            }
        };
    }
}
package creational.classactivity;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type){
        if(type==null){
            return  null;
        }

        switch (type.toUpperCase()){
            case "CREDITCARD":
                return new CreditCardPayment();
            case "GOOGLEPAY":
                return new GoolgePayPayment();
            default:
                return null;
        }
    }
}

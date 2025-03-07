package factory.classactivity;

import java.util.Scanner;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Payment payment = null;

        while(payment==null){
            System.out.println("Select payment Method (CREDITCARD, GOOGLEPAY) or type EXIT to quit: ");
            String paymentType = scanner.nextLine();

            if(paymentType.equalsIgnoreCase("EXIT")){
                System.out.println("Exiting program. No payment processed");
                scanner.close();
                return;
            }

            payment = PaymentFactory.getPaymentMethod(paymentType);
            if(payment==null){
                System.out.println("Invalid payment method. Please try again");
            }
        }
        payment.processPayment(100.00);
        scanner.close();
    }
}

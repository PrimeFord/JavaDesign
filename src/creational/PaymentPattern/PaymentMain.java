package creational.PaymentPattern;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner method = new Scanner(System.in);
        String methodPay;

        //Sting to Print
        System.out.println("Enter Payment Method [Credit card, Paypal, Apple Pay, Google Pay]:  ");

        methodPay = method.nextLine();
        PaymentFactory paymentFactory = new PaymentFactory();

        Payment paymentMethod = paymentFactory.processPayment(methodPay);
        paymentMethod.processPayment();
    }
}

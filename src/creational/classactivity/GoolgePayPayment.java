package creational.classactivity;

class GoolgePayPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Google Pay Payment £:" +amount);
    }
}

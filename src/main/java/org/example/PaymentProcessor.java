package org.example;

public class PaymentProcessor {
    Logger logger;

    PaymentProcessor(FileLogger logger){
        this.logger = logger;
    }
    public void processPayment(double amount) {
        logger.log("Processing payment of " + amount);
        System.out.println("Payment of " + amount + " completed.");
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        FileLogger file = new FileLogger();
        PaymentProcessor processor = new PaymentProcessor(file);
        processor.processPayment(500.0);
    }
}
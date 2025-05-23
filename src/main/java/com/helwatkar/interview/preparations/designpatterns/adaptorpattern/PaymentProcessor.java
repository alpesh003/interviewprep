package com.helwatkar.interview.preparations.designpatterns.adaptorpattern;

import org.springframework.stereotype.Component;

@Component
public interface PaymentProcessor {
    void processPayment(String paymentType, double amount);

    default void logPayment(String paymentType, double amount) {
        System.out.println("Logging payment of type: " + paymentType + " with amount: " + amount);
    }

    static void validatePaymentDetails(String paymentType, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        System.out.println("Validating payment details for type: " + paymentType);
    }
}

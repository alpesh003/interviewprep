package com.helwatkar.interview.preparations.designpatterns.adaptorpattern;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = new PaymentAdapter(new ExternalPaymentGateway());
    }

    public void sendPayment(double amount, String paymentType) {
        paymentProcessor.processPayment(paymentType, amount);
    }

}

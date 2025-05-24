package com.helwatkar.interview.preparations.designpatterns.adaptorpattern;

import org.springframework.stereotype.Component;

@Component
public class PaymentAdapter implements PaymentProcessor {
    private final ExternalPaymentGateway externalPaymentGateway;

    // Constructor injection for the external payment gateway - No @Autowired required as spring will handle it considering single constructor.
    public PaymentAdapter(ExternalPaymentGateway externalPaymentGateway) {
        this.externalPaymentGateway = externalPaymentGateway;
    }

    @Override
    public void processPayment(String paymentType, double amount) {
        externalPaymentGateway.sendPayment(paymentType, amount);
    }
}

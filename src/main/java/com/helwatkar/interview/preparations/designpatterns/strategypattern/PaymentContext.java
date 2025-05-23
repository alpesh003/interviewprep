package com.helwatkar.interview.preparations.designpatterns.strategypattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentContext {
    private final Map<String, PaymentStrategy> paymentStrategies;

    @Autowired
    public PaymentContext(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }
    public void pay(String paymentType, double amount) {
        PaymentStrategy paymentStrategy = paymentStrategies.get(paymentType);
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("Payment method not supported.");
        }
    }
}

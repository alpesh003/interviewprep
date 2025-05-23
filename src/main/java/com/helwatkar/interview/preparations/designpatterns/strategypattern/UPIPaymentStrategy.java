package com.helwatkar.interview.preparations.designpatterns.strategypattern;

import org.springframework.stereotype.Service;

@Service("upiPaymentStrategy")
public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

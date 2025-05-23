package com.helwatkar.interview.preparations.designpatterns.strategypattern;

import org.springframework.stereotype.Service;

@Service("razorPayPaymentStrategy")
public class RazorPayPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using RazorPay.");
    }
}

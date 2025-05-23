package com.helwatkar.interview.preparations.designpatterns.strategypattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("creditCardPaymentStrategy")
@Slf4j
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        log.info("Paid {} using Credit Card.", amount);
    }
}

package com.helwatkar.interview.preparations.designpatterns.adaptorpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ExternalPaymentGateway {
    public void sendPayment(String paymentType, double amount) {
        log.info("Sending payment of type: {}, with amount: ()", paymentType, amount);
    }
}

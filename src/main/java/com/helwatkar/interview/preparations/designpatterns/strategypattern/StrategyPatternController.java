package com.helwatkar.interview.preparations.designpatterns.strategypattern;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/designpatterns/strategy")
public class StrategyPatternController {

    private final PaymentContext paymentContext;

    public StrategyPatternController(PaymentContext paymentContext) {
        this.paymentContext = paymentContext;
    }

    @GetMapping("/welcome")//http://localhost:8080/api/v1/designpatterns/strategy/welcome
    public String welcomeStrategyPattern(@RequestParam(value = "name", defaultValue = "Visitor") String name) {
        return "Welcome to Strategy Pattern Controller " + name + "!";
    }

    @PostMapping("/{payType}/{amount}")// in windows command: curl -X POST "http://localhost:8080/api/v1/designpatterns/strategy/creditCardPaymentStrategy/200.0"
    public String makePayment(@PathVariable String payType, @PathVariable double amount) {
        paymentContext.pay(payType, amount);
        return "Payment of amount " + amount + " using type : "+ payType + " has been processed successfully!";
    }

}

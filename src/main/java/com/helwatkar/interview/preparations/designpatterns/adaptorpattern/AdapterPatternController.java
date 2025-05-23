package com.helwatkar.interview.preparations.designpatterns.adaptorpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/designpatterns/adapter")
@Slf4j
public class AdapterPatternController {
    private final PaymentService paymentService;

    public AdapterPatternController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/welcome")//http://localhost:8080/api/v1/designpatterns/adapter/welcome
    public String welcomeAdapterPattern(@RequestParam(value = "name", defaultValue = "Visitor") String name) {
        return "Welcome to Adapter Pattern Controller " + name + "!";
    }

    @PostMapping("/{amount}")//in windows command: curl -X POST "http://localhost:8080/api/v1/designpatterns/adapter/200.0"
    public String makePayment(@PathVariable double amount) {
        paymentService.sendPayment(amount, "Credit Card");
        return "Payment of amount " + amount + " has been processed successfully!";
    }
}

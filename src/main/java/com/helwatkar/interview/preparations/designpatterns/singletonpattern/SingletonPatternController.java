package com.helwatkar.interview.preparations.designpatterns.singletonpattern;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/designpatterns/singleton")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SingletonPatternController {

    private final SingletonPattern singletonPattern;

    @GetMapping("/welcome")
    public String welcomeSingleton() {
        return "Welcome to Singleton Pattern API!";
    }

    @GetMapping("/message")
    public String getSingletonMessage() {
        log.info("Singleton message: {}", singletonPattern.getMessage());
        return singletonPattern.getMessage();
    }
}

package com.helwatkar.interview.preparations.designpatterns.factorypattern;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/designpatterns/factory")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FactoryController {

    private final FactoryPattern factoryPattern;

    @GetMapping("/welcome") // http://localhost:8080/api/v1/designpatterns/factory/welcome
    public String welcomeFactoryPattern() {
        log.info("Welcome to Factory Pattern Controller!");
        return "Welcome to Factory Pattern Controller!";
    }

    @GetMapping("/factoryKeys")
    public String getFactoryImplementations() {
        log.info("Retrieving factory implementations...");
        Map<String, FactoryInterface> interfaceMap = factoryPattern.getFactoryImplementations();
        for (Map.Entry<String, FactoryInterface> entry : interfaceMap.entrySet()) {
            String factoryType = entry.getKey();
            FactoryInterface factoryImplementation = entry.getValue();
            log.info("Factory Type: {}, Implementation: {}", factoryType, factoryImplementation.getClass().getSimpleName());
            // You can also call factoryImplementation.factoryDescription() if needed
        }
        return "Factory Implementations Retrieved Successfully! as [" + interfaceMap+"]";
    }
}
